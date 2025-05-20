import math
 
def arithmetic_ops(a, b):
    print("\nArithmetic:")
    print(f"{a} + {b} = {a + b}")
    print(f"{a} - {b} = {a - b}")
    print(f"{a} * {b} = {a * b}")
    print(f"{a} / {b} = {a / b}" if b != 0 else "Division by zero error")
 
def bitwise_ops(x, y):
    print("\nBitwise:")
    print(f"{x} & {y} = {x & y}")
    print(f"{x} | {y} = {x | y}")
    print(f"{x} ^ {y} = {x ^ y}")
    print(f"{x} << 1 = {x << 1}")
    print(f"{y} >> 1 = {y >> 1}")
 
def quadratic_solver(a, b, c):
    print("\nQuadratic Solver:")
    d = b**2 - 4*a*c
    if d > 0:
        r1 = (-b + math.sqrt(d)) / (2*a)
        r2 = (-b - math.sqrt(d)) / (2*a)
        print(f"Real & Distinct Roots: {r1}, {r2}")
    elif d == 0:
        r = -b / (2*a)
        print(f"Real & Equal Root: {r}")
    else:
        rp = -b / (2*a)
        ip = math.sqrt(-d) / (2*a)
        print(f"Complex Roots: {rp}+{ip}i, {rp}-{ip}i")
 
# Input
a = float(input("Enter 1st number: "))
b = float(input("Enter 2nd number: "))
arithmetic_ops(a, b)
bitwise_ops(int(a), int(b))
 
print("\n-- Quadratic Equation --")
a = float(input("a: "))
b = float(input("b: "))
c = float(input("c: "))
quadratic_solver(a, b, c) (f
 
