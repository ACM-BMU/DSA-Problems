#https://www.hackerrank.com/challenges/word-order/problem?isFullScreen=false

num = int(input())
str = []
for i in range(num):
    str.append(input())
    
print(len(list(set(str))))

str_count = {}
for i in str:
    if i in str_count:
        str_count[i] += 1
    else:
        str_count[i] = 1
        
for key,value in str_count.items():
    print(f"{value}", end=" ")
