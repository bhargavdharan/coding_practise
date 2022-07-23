import numpy as np

# given Array
M = np.array([11,22,33],[23,24,25],[24,24,34])

print('A : ',M)

print('Transpose of A:\t'+M.T)

S = np.matmul(M,M.T)

print("Symmetric Matrix:\t"+S)

# n = 3

# to find difference between two diagonals
# def diff(S,n):
#     d1=0
#     d2=0
#     for i in range(0,n):
#          for j in range(0,n):
#               if(i==j):
#                   d1 += S[i][j]
#               if(i== n-j-1):
#                   d2 += S[i][j]
#     return abs(d1-d2);