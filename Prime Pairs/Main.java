def primes(b):
    prime = [True for i in range(b + 1)]
    prime[0] = False
    prime[1] = False
    p = 2
    while (p*p <= b):
        if (prime[p] == True):
            #update all multiples of p
            for i in range(p*p,b+1,p):
                prime[i] = False
        p += 1
    return prime

def sexy_numbers(x,y):
    list1 = list(range(x, y+1))
    n = len(list1)

    prime = primes(y)

    count = 0

    freq =[0]*(y + 6)

    for i in range(n):
        freq[list1[i]] += 1
    
    for i in range(n):
        if prime[list1[i]]:
            if ((list1[i] + 6) <= y) and (freq[list1[i] + 6] > 0) and (prime[list1[i] + 6]):
                count += 1
    return count






x = int(input())
y = int(input())

result = sexy_numbers(x, y)

if result == 0:
	print("No Prime Pairs")
else:
	print(result)




