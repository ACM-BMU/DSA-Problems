{\rtf1\ansi\ansicpg1252\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.io.*;\
import java.util.Scanner;\
\
abstract class Shape\{\
    abstract public void calc_area();\
    abstract public void calc_volume();\
    final float pi=3.14f;\
\}\
\
class Sphere extends Shape\{\
    double r;\
    private double area;\
    private double volume;\
    public void accept() throws IOException\{\
        System.out.println("Enter the radius of the Sphere: ");\
        Scanner sc = new Scanner(System.in);\
        r=sc.nextDouble();\
    \}\
    public void calc_area()\{\
        area=pi*r*r;\
    \}\
    public void calc_volume()\{\
\
        volume=1.33333333334*pi*r*r*r;\
    \}\
    public void display()\{\
        calc_area();\
        calc_volume();\
        System.out.println("The area of sphere is: "+area);\
        System.out.println("The volume of sphere is: "+volume);\
    \}\
\}\
\
\
class  triangle extends Shape\{\
    double h,b,area,volume;\
    public void accept() throws IOException\{\
        System.out.println("Enter the base and height: ");\
        Scanner sc = new Scanner(System.in);\
        b=sc.nextDouble();\
        h=sc.nextDouble();\}\
    public void calc_area()\{\
        area=0.5*b*h;\
    \}\
    public void calc_volume()\{\
        volume=-1;\
    \}\
    public void display()\{\
        calc_area();\
        calc_volume();\
        System.out.println("The area of Triangle is: "+area);\
        System.out.println("The volume of Triangle is: "+volume);\
    \}\
\}\
class cube extends Shape\{\
    double l,w,h;\
    private double area;\
    private double volume;\
    public void accept() throws IOException\{\
        System.out.println("Enter the measurements: ");\
        Scanner sc = new Scanner(System.in);\
        l=sc.nextDouble();\
        w=sc.nextDouble();\
        h=sc.nextDouble();\
    \}\
    public void calc_area()\{\
        area=2*l*w + 2*l*h + 2*w*h;\
    \}\
    public void calc_volume()\{\
\
        volume= l * w * h;\
    \}\
    public void display()\{\
        calc_area();\
        calc_volume();\
        System.out.println("The area cube of  is: "+area);\
        System.out.println("The volume of cube is: "+volume);\
    \}\}\
\
\
class rectangle extends Shape\{\
    double w,l,area,volume;\
    public void accept() throws IOException\{\
        System.out.println("Enter the measurements: ");\
       Scanner sc =new Scanner(System.in);\
       w= sc.nextDouble();\
       l= sc.nextDouble();\
    \}\
    public void calc_area()\{\
        area=l*w;\
    \}\
    public void calc_volume()\{\
        volume=-1;\
    \}\
    public void display()\{\
        calc_area();\
        calc_volume();\
        System.out.println("The area of Box is: "+area);\
        System.out.println("The volume of Box is: "+volume);\
    \}\
\}\
\
\
class sa2 \{\
    public void main(String[] args)throws IOException\{\
        Sphere s=new Sphere();\
        s.accept();\
        s.display();\
        triangle co=new triangle();\
        co.accept();\
        co.display();\
        rectangle c =new rectangle();\
        c.accept();\
        c.display();\
        cube b=new cube();\
        b.accept();\
        b.display();\
    \}\
\}import java.io.*;\
import java.util.Scanner;\
\
abstract class Shape\{\
    abstract public void calc_area();\
    abstract public void calc_volume();\
    final float pi=3.14f;\
\}\
\
class Sphere extends Shape\{\
    double r;\
    private double area;\
    private double volume;\
    public void accept() throws IOException\{\
        System.out.println("Enter the radius of the Sphere: ");\
        Scanner sc = new Scanner(System.in);\
        r=sc.nextDouble();\
    \}\
    public void calc_area()\{\
        area=pi*r*r;\
    \}\
    public void calc_volume()\{\
\
        volume=1.33333333334*pi*r*r*r;\
    \}\
    public void display()\{\
        calc_area();\
        calc_volume();\
        System.out.println("The area of sphere is: "+area);\
        System.out.println("The volume of sphere is: "+volume);\
    \}\
\}\
\
\
class  triangle extends Shape\{\
    double h,b,area,volume;\
    public void accept() throws IOException\{\
        System.out.println("Enter the base and height: ");\
        Scanner sc = new Scanner(System.in);\
        b=sc.nextDouble();\
        h=sc.nextDouble();\}\
    public void calc_area()\{\
        area=0.5*b*h;\
    \}\
    public void calc_volume()\{\
        volume=-1;\
    \}\
    public void display()\{\
        calc_area();\
        calc_volume();\
        System.out.println("The area of Triangle is: "+area);\
        System.out.println("The volume of Triangle is: "+volume);\
    \}\
\}\
class cube extends Shape\{\
    double l,w,h;\
    private double area;\
    private double volume;\
    public void accept() throws IOException\{\
        System.out.println("Enter the measurements: ");\
        Scanner sc = new Scanner(System.in);\
        l=sc.nextDouble();\
        w=sc.nextDouble();\
        h=sc.nextDouble();\
    \}\
    public void calc_area()\{\
        area=2*l*w + 2*l*h + 2*w*h;\
    \}\
    public void calc_volume()\{\
\
        volume= l * w * h;\
    \}\
    public void display()\{\
        calc_area();\
        calc_volume();\
        System.out.println("The area cube of  is: "+area);\
        System.out.println("The volume of cube is: "+volume);\
    \}\}\
\
\
class rectangle extends Shape\{\
    double w,l,area,volume;\
    public void accept() throws IOException\{\
        System.out.println("Enter the measurements: ");\
       Scanner sc =new Scanner(System.in);\
       w= sc.nextDouble();\
       l= sc.nextDouble();\
    \}\
    public void calc_area()\{\
        area=l*w;\
    \}\
    public void calc_volume()\{\
        volume=-1;\
    \}\
    public void display()\{\
        calc_area();\
        calc_volume();\
        System.out.println("The area of Box is: "+area);\
        System.out.println("The volume of Box is: "+volume);\
    \}\
\}\
\
\
class sa2 \{\
    public void main(String[] args)throws IOException\{\
        Sphere s=new Sphere();\
        s.accept();\
        s.display();\
        triangle co=new triangle();\
        co.accept();\
        co.display();\
        rectangle c =new rectangle();\
        c.accept();\
        c.display();\
        cube b=new cube();\
        b.accept();\
        b.display();\
    \}\
\}}