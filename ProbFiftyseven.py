from fractions import Fraction
def main():
    count = 0
    numer = 3
    den = 2
    for num in range(0,1000):

        if(len(str(numer))>len(str(den))):
            count = count + 1
        tempNumer = numer
        tempDen = den
        numer = tempNumer + (2*tempDen)
        den = tempNumer + tempDen


    print(count)

if __name__ == "__main__": main()
