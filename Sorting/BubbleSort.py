l = [5,3,8,6,5,7,2,6]
print(l)
for i in range(len(l)-1):
    for j in range(i+1,len(l)):
        if l[i] > l[j]:
            l[i],l[j] = l[j],l[i]
print(*l)
