#include <iostream>
#include <stdio.h>
#include <string.h>
//#include <conio.h>

using namespace std;

void sort(char arr[100])
{
	int i,j;
	char temp,var;

	for(i=0;arr[i]!='\0';i++)
	{
		var = arr[i];

		for(j=i+1;arr[j]!='\0';j++)
		{
			if(arr[j] < var)
			{
				var = arr[j];				
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;		
			}
		}
	
	}
		//cout<<"*******************\n";
		//cout<<arr<<"\n";	
}

int check(char arr[100][100],int n)
{
	int flag = 1;
	int i,j;

	for(j=0;j<n;j++)
		{
			for(i=1;i<n;i++)
			{
				if(arr[i][j]<arr[i-1][j])
				{
					flag = 0;
					return 0;
				}
			}
		}	
	return 1;	
}

int main()
{
	int k,i,j;
	char arr[100][100];
	
	cin>>k;	
	
	//const int m = k;
	
	int *n = new int[k];

	//getch();

	//cout<<"values of n are\n";

	//for(i=0;i<k;i++)	
	//	cout<<n[i]<<endl;

	int res,ctr = 0,flag;
    char ch;
	//
cin.getline(arr[0],100);
	while(ctr!=k)
	{

	flag = 0;	
	
	cin.get(ch);
    	n[ctr] = (int)ch-48;

	cout<<"value of n[ctr] is"<<n[ctr]<<"\n";

	
	//cout<<"value of ctr is "<<ctr<<"/n";

	//cout<<"value of n[ctr] is "<<n[ctr]<<"\n";

	for(i=0;i<n[ctr];i++)
		{
	//		cout<<"enter "<<i<<"\n";
			cin.getline(arr[i],100);
		}

	for(i=0;i<n[ctr];i++)
	{
		sort(arr[i]);
			
	}

	res = check(arr,n[ctr]);
	
	if(res == 1)
		{
			flag = 1;
//			break;
		}	

	if(flag == 1)
		cout<<"YES\n";
	else
		cout<<"NO\n";
	ctr++;

	}
	return 0;
}
