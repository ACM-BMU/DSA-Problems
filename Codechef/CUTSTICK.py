from collections import Counter
n = int(input())

a = list(map(int, input().split()))


m = dict(Counter(a))

k = sorted(m)

print(sum(m.values()))
for i in range(len(k)):
    
    del m[k[i]]
    
    if sum(m.values()) != 0:
        print(sum(m.values()))
        
    else:
        break
