#include<iostream>
using namespace std;

int sumArray(int arr[],int sz){
    int sum=0;
    for(int i=0;i<sz;i++){
        sum=sum+arr[i];
    }
    return sum;
}
int main(){
    int arr[]={1,2,3,4,5};
    int sz=5;
    cout<<sumArray(arr,sz)<<;
    return 0;
}