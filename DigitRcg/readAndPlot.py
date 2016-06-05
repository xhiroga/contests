import scipy
import numpy as np
import pandas as pd
from os import path

def lardcsv(filename):
    cpath = path.dirname(path.abspath(__file__))
    print "cpath",cpath

    data = pd.read_csv(cpath+"/"+filename, header=None)
    print "load data =",data

return data

#compute cost J
