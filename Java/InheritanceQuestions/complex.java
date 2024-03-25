package Java.InheritanceQuestions;
/*Define a class complex to represent an object for a complex number like Z = X +i.Y 
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
    public static void main(String[] args) {
        complex z1 = new complex(3, 4);
        complex z2 = new complex(2, -1);

        complex sum = z1.add(z2);
        complex diff = z1.sub(z2);
        complex prod = z1.mul(z2);
        double mag1 = z1.magnitude();
        double mag2 = z2.magnitude();
        complex conj1 = z1.conjugate();
        complex conj2 = z2.conjugate();

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Magnitude of z1: " + mag1);
        System.out.println("Magnitude of z2: " + mag2);
        System.out.println("Conjugate of z1: " + conj1);
        System.out.println("Conjugate of z2: " + conj2);
    }
}


