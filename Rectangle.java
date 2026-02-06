// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double w, double h, double oX, double oY) {
    this.width = w;
    this.height = h;
    this.originX = oX;
    this.originY = oY;
  }

  // second constructor 

  public Rectangle(double width, double height){
    this(width, height, 0, 0);
  }

  // third constructor 

  public Rectangle(){
    this(0,0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  // method: change scale of rectangle for each coord 
  public void scale (double scaleX, double scaleY){
    width *= scaleX;
    height *= scaleY;
  }

  //method: change scale for both 
  public void scale(double scale){
    scale(scale, scale);
  }

  public boolean isOverlappedWith (Rectangle r){
    double leftA = this.originX;
    double rightA = this.originX + this.width;
    double topA = this.originY;
    double bottomA = this.originY + this.height;

    double leftB = r.originX;
    double rightB = r.originX + r.width;
    double topB = r.originY;
    double bottomB = r.originY + r.height;

    if (rightA <= leftB || rightB <= leftA || bottomA <= topB || bottomB <= topA ){
      return false;
    }

    return true;

  }

  public double calcRatio() {
    return width/height;
  }

  public boolean isSquare(){
    if (width == height){
      return true;
    }
    else{
      return false;
    }
  }
  
}
