#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter a numbers : ";
    cin>>n;
    int result=0;
    for(int i=1;i<=n;i++){
        if(n%2==0){
            result-=i;
        }
        else{
            result+=i;
        }
    }
    cout<<result<<endl;
}