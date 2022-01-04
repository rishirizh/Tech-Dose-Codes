l = [5,3,8,6,5,7,2,6]
n = len(l)
print(l)
for i in range(1,n):
    key = l[i]
    j = i-1
    while j>=0 and key < l[j]:
        l[j+1] = l[j]
        j-=1
    l[j+1] = key
print(*l)
