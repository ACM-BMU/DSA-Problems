#include<stdio.h>
#include<stdlib.h> 
#define defautdistance 999
int Graph[30][30],spanning[20][20],n;
int main()
{
	int i,j,total_cost;
	printf("Enter no. of vertex");
	scanf("%d",&n);
	
	printf("\nEnter the adjacency matrix:\n");
	
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			scanf("%d",&Graph[i][j]);
	
	total_cost=prims();
	printf("\nspanning tree matrix:\n");
	
	for(i=0;i<n;i++)
	{
		printf("\n");
		for(j=0;j<n;j++)
			printf("%d\t",spanning[i][j]);
	}
	
	printf("\n\nTotal cost of spanning tree=%d",total_cost);
	return 0;
}
 
int prims()
{
	int cost[20][20];
	int u,v,min_distance,distance[20],LastVertex[20];
	int visited[20],no_of_edges,i,min_cost,j;
	
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
			if(Graph[i][j]==0)
				cost[i][j]=defautdistance;
			else
				cost[i][j]=Graph[i][j];
				spanning[i][j]=0;
		}
		
	distance[0]=0;
	visited[0]=1;
	
	for(i=1;i<n;i++)
	{
		distance[i]=cost[0][i];
		LastVertex[i]=0;
		visited[i]=0;
	}
	
	min_cost=0;		
	no_of_edges=n-1;		
	
	while(no_of_edges>0)
	{
		min_distance=defaultdistance;
		for(i=1;i<n;i++)
			if(visited[i]==0&&distance[i]<min_distance)
			{
				v=i;
				min_distance=distance[i];
			}
			
		u=from[v];
		spanning[u][v]=distance[v];
		spanning[v][u]=distance[v];
		no_of_edges--;
		visited[v]=1;
		for(i=1;i<n;i++)
			if(visited[i]==0&&cost[i][v]<distance[i])
			{
				distance[i]=cost[i][v];
				from[i]=v;
			}
		
		min_cost=min_cost+cost[u][v];
	}
	
	return(min_cost);
}
