# Last updated: 8/21/2025, 12:08:19 PM
class Solution:
    def countStudents(self, st: List[int], sa: List[int]) -> int:
        while True:
            if st[0]==sa[0]:
                st.remove(st[0])
                sa.remove(sa[0])
            else:
                st.append(st[0])
                st.remove(st[0])
            if sa==[] or sa[0] not in st:
                return len(st)
        