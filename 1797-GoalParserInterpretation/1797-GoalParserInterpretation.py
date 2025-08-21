# Last updated: 8/21/2025, 12:08:20 PM
class Solution:
    def interpret(self, command: str) -> str:
        return command.replace('()', 'o').replace('(al)', 'al')
        