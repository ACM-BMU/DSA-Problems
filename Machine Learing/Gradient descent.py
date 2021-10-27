import numpy as np


def gradientdescent(x, y):
    m = b = 0
    itr = 1000
    n = len(x)
    lr = 0.001

    for i in range(itr):
        y_predicted = (m*x + b)
        m_derivative = -(2/n)*sum(x*(y-y_predicted))
        b_derivative = -(2/n)*sum(y-y_predicted)
        m = m - lr*m_derivative
        b = b - lr*b_derivative
        print("m{},b{},iterations{}".format(m,b,i))


x = np.array([92, 56, 88, 70, 80, 49, 65, 35, 66, 67])
y = np.array([98, 68, 81, 80, 83, 52, 66, 30, 68, 73])

gradientdescent(x,y)
