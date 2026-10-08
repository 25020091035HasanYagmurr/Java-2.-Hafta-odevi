package odev9;

public class RegularPolygon {

private int n;
private double side;
private double x;
private double y;

public RegularPolygon(){
this.n=3;
this.side=1;
this.x=0.0;
this.y=0.0;
}
public RegularPolygon(int n,double side){
    this.n=n;
    this.side=side;
    this.x=0.0;
    this.y=0.0;
}
public RegularPolygon(int n,double side,double x,double y){
    this.n=n;
    this.side=side;
    this.x=x;
    this.y=y;
}

public int getn(){
return this.n;
}
public void setn(int n){
 this.n=n;
}

public double getside(){
return this.side;
}
public void setside(int side){
 this.side=side;
}

public double getx(){
return this.x;
}
public void setx(int x){
 this.x=x;
}

public double gety(){
return this.y;
}
public void sety(int y){
 this.y=y;
}
public double getArea(){
return (this.n*this.side*this.side)/(4*Math.tan(Math.PI/this.n));
}
public double getPerimeter(){
return n*n ;
}

    
}