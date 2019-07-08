PImage mustache;
PImage person;
void setup(){
person = loadImage("person.jpg");

size(800, 600);
person.resize(width,height);



}
void draw(){
background(person);
mustache = loadImage("mustache.jpg");
image(mustache, mouseX,mouseY); 
}
