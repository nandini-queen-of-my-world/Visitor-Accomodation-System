package Java.InheritanceQuestions;
/*Define a class Complex to represent an object for a complex number like Z = X +i.Y 
with the following methods:
Write the main class and instantiate the objects of the above-mentioned classes. */
public class complex {
    private double real;
    private double imaginary;

    public complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public complex add(complex z) {
        double realPart = this.real + z.real;
        double imaginaryPart = this.imaginary + z.imaginary;
        return new complex(realPart, imaginaryPart);
    }

    public complex sub(complex z) {
        double realPart = this.real - z.real;
        double imaginaryPart = this.imaginary - z.imaginary;
        return new complex(realPart, imaginaryPart);
    }

    public complex mul(complex z) {
        double realPart = this.real * z.real - this.imaginary * z.imaginary;
        double imaginaryPart = this.real * z.imaginary + this.imaginary * z.real;
        return new complex(realPart, imaginaryPart);
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }

    public complex conjugate() {
        return new complex(this.real, -this.imaginary);
    }

    public String toString() {
        if (this.imaginary >= 0) {
            return this.real + " + " + this.imaginary + "i";
        } else {
            return this.real + " - " + (-this.imaginary) + "i";
        }
    }
}

