#https://www.hackerrank.com/challenges/no-idea/problem

n, m = input().split()
n = int(n)
m = int(m)
happiness = 0
arr = []
arr = input().split()
for i in range(len(arr)):
    arr[i] = int(arr[i])
    
a = []
a = input().split()
for i in range(len(a)):
    a[i] = int(a[i])
a = set(a)

b = []
b = input().split()
for i in range(len(b)):
    b[i] = int(b[i])
b = set(b)

for i in arr:
    if(i in a):
        happiness+=1
    elif(i in b):
        happiness-=1
        
print(happiness)
