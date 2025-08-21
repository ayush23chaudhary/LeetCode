// Last updated: 8/21/2025, 12:06:07 PM
#include <vector>
#include <string>
#include <queue>
#include <algorithm>
#include <sstream>
using namespace std;

struct OfflineEvent {
    int endTime;
    int userId;
};

struct CompareOfflineEvent {
    bool operator()(const OfflineEvent& a, const OfflineEvent& b) const {
        return a.endTime > b.endTime;
    }
};

class Solution {
public:
    vector<int> countMentions(int totalUsers, vector<vector<string>>& eventLog) {
        sort(eventLog.begin(), eventLog.end(), [&](const vector<string>& a, const vector<string>& b) -> bool {
            return stoi(a[1]) < stoi(b[1]);
        });

        vector<int> countMentions(totalUsers, 0);
        vector<bool> isUserOnline(totalUsers, true);
        priority_queue<OfflineEvent, vector<OfflineEvent>, CompareOfflineEvent> offlineEvents;

        int eventCount = eventLog.size();
        int eventIndex = 0;

        while (eventIndex < eventCount) {
            int currentTime = stoi(eventLog[eventIndex][1]);

            while (!offlineEvents.empty() && offlineEvents.top().endTime <= currentTime) {
                int userId = offlineEvents.top().userId;
                if (userId >= 0 && userId < totalUsers) {
                    isUserOnline[userId] = true;
                }
                offlineEvents.pop();
            }

            int nextEventIndex = eventIndex;
            while (nextEventIndex < eventCount && stoi(eventLog[nextEventIndex][1]) == currentTime) {
                nextEventIndex++;
            }

            for (int k = eventIndex; k < nextEventIndex; ++k) {
                if (eventLog[k][0] == "OFFLINE") {
                    int userId = stoi(eventLog[k][2]);
                    if (userId >= 0 && userId < totalUsers && isUserOnline[userId]) {
                        isUserOnline[userId] = false;
                        OfflineEvent newOfflineEvent = {currentTime + 60, userId};
                        offlineEvents.push(newOfflineEvent);
                    }
                }
            }

            for (int k = eventIndex; k < nextEventIndex; ++k) {
                if (eventLog[k][0] == "MESSAGE") {
                    string mentionList = eventLog[k][2];
                    if (mentionList == "ALL") {
                        for (int userId = 0; userId < totalUsers; ++userId) {
                            countMentions[userId]++;
                        }
                    } else if (mentionList == "HERE") {
                        for (int userId = 0; userId < totalUsers; ++userId) {
                            if (isUserOnline[userId]) {
                                countMentions[userId]++;
                            }
                        }
                    } else {
                        stringstream ss(mentionList);
                        string token;
                        while (ss >> token) {
                            if (token.size() >= 3 && token.substr(0, 2) == "id") {
                                string idString = token.substr(2);
                                bool isValidId = true;
                                for (char ch : idString) {
                                    if (!isdigit(ch)) {
                                        isValidId = false;
                                        break;
                                    }
                                }
                                if (isValidId) {
                                    int userId = stoi(idString);
                                    if (userId >= 0 && userId < totalUsers) {
                                        countMentions[userId]++;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            eventIndex = nextEventIndex;
        }

        return countMentions;
    }
};
