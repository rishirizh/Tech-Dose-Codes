l = [5,3,8,5,7,6,15,222,3010101,9292,-1,-392,-111,900101,-2929292]
n = len(l)
print(l)
for i in range(n):
    idx = i
    for j in range(i+1,n):
        if l[j]<l[idx]:
            idx = j
    l[i],l[idx] = l[idx],l[i]
print(*l)
