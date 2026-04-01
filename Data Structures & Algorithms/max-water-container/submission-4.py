class Solution:
    def calculate_container(self,l,r,height_l,height_r) -> int:
        return (r-l)*min(height_l,height_r)
    def maxArea(self, heights: List[int]) -> int:
        water=0
        n=len(heights)
        l=0
        r=n-1
        while l<r :
            
            curWater= self.calculate_container(l,r,heights[l],heights[r])
            water=max(water,curWater)
            if heights[r]<heights[l]:
                r=r-1
            else:
                l=l+1

        return water

            
