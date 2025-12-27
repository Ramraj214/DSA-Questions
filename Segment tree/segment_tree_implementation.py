class SegmentTree:
    def __init__(self,n):
        self.tree = [0]*(4*n)
    
    def build(self,arr,i,start,end):
        if start == end:
            self.tree[i] = arr[start]
            return arr[start]
 
        mid = (start+end)//2
        left_sum = self.build(arr,2*i+1,start,mid)
        right_sum = self.build(arr,2*i+2,mid+1,end)
        self.tree[i]=left_sum+right_sum
        return self.tree[i]

    def getSumUtil(self,i,si,sj,qi,qj):
        if(qj<=si or qi>=sj):#non overlap
            return 0
        elif(si>=qi and sj<=qj):#complete overlap
            return self.tree[i]
        else:
            mid = (si+sj)//2
            left = self.getSumUtil(2*i+1,si,mid,qi,qj)
            right = self.getSumUtil(2*i+2,mid+1,sj,qi,qj)
            return left + right

    def getSum(self,arr,qi,qj):
        n=len(arr)
        return self.getSumUtil(0,0,n-1,qi,qj)

    def updateUtil(self,i,si,sj,idx,diff):
        if(idx<si or idx>sj):
            return
        self.tree[i]+=diff
        if(si!=sj): #non-leaf
            mid=(si+sj)//2
            self.updateUtil(i*2+1,si,mid,idx,diff) #left 
            self.updateUtil(i*2+2,mid+1,sj,idx,diff) #right

    def getUpdate(self,arr,idx,newvalue):
        n=len(arr)
        diff=newvalue-arr[idx]
        arr[idx]=newvalue
        return self.updateUtil(0,0,n-1,idx,diff)

if __name__ == "__main__":  
    arr=[1,2,3,4,5,6,7,8]
    n=len(arr)
    st=SegmentTree(n)
    st.build(arr,0,0,n-1)
    # print("segment tree:",st.tree)
    sum = st.getSum(arr,0,7)
    print("sum of sub array is",sum)
    st.getUpdate(arr,2,2)
    sum = st.getSum(arr,0,7)
    print("sum of sub array is",sum)