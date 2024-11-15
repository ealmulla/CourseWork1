public double sphere(double d) {
    double r = 0.5 * d;
    double v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    return v;
}

// Call the method and print the result
double ans = sphere(20.24);
System.out.println(ans);