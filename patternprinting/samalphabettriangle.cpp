 #include<iostream>
 using namespace std;
 int main(){
    int n;
    cout<<"enter a number = ";
    cin>>n;
    char ch = 'A';
    for(int i=1;i<=n;i++){
        // char ch = 'A';
        for(int j=1;j<i+1;j++){
            cout<<ch<<" ";
            ch++;
        }
         cout<<endl;
    }
}