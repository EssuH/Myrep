void setup(){
size(400,400);
}
int red = #FF0307;
int yellow = #F6FF00;
int green = #3AFF00;
int grey = #636B6C;

void draw(){
//kasse
fill(grey);
rect(150,50,100,300);

//red light
fill(red);
ellipse(200,100,90,90);

//yellow light
fill(yellow);
ellipse(200,200,90,90);

//green light
fill(green);
ellipse(200,300,90,90);
}
