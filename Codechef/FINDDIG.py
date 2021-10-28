# cook your dish here
t=int(input())
l=[]
for i in range(t) :
    a=n=int(input())
    c=0
    while(n!=0) :
        x=n%10
        if x!=0 and a%x==0 :
            c=c+1
        n=n//10
    l.append(c)
for i in l :
    print(i)
