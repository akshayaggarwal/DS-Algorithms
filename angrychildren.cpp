#include <iostream>
#include <stdio.h>
//#include <conio.h>

using namespace std;

/*void sort(char *arr,int n)
{
	int i,j;
	char temp;

	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if((*(arr+j)) < (*(arr+(j-1))))
			{
				temp = (*(arr+j));
				(*(arr+j)) = (*(arr+(j-1)))
				(*(arr+(j-1))) = temp;		
			}
		}
	}
}*/	

int main()
{
	int n,k,i,j;

	cin>>k;	
	cin>>n;

	char arr[100][100];

	int ctr = 0;

	while(ctr!=k)
	{

//	arr[ctr] = new int[100];

	gets(arr[ctr]);

	ctr++;

	}

	for(i=0;i<k;i++)
		cout<<arr[ctr];
/*
	for(i=0;i<n;i++)
		cin<<arr[i];
	
	for(i=0;i<n;i++)
		{
					
		}
	
	}		*/
	return 0;
}
