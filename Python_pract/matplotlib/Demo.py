# import matplotlib
import matplotlib.pyplot as plt
import numpy as np

# print(matplotlib.__version__) #3.1.3

xPoints = np.array([0,6])
yPoints = np.array([0,250])
zPoints = np.array([0,300])

plt.plot(xPoints,yPoints,zPoints)
plt.show()