# Last updated: 8/21/2025, 12:09:21 PM
class Solution:
    def canPlaceFlowers(self, f: List[int], n: int) -> bool:
        c=0
        if n==0:
            return True
        elif len(f)==1 and f[0]==0 and n==1:
            return True
    
        else:
            for i in range(len(f)):
                if f[i]==0 and i!=0 and i!=len(f)-1 and f[i-1]==f[i+1]==0:
                    f[i]=1
                    c+=1
                elif i==0 :
                    if f[i]==0 and f[i+1]==0:
                        c+=1
                        f[i]=1
                elif i==len(f)-1:
                    if f[i]==0 and f[i-1]==0:
                        f[i]=1
                        c+=1

        if c>=n:
            return True
        else:
            return False