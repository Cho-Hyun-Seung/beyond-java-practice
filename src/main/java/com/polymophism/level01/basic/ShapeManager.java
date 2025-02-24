package com.polymophism.level01.basic;


public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index = 0;


    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        if(this.index == this.shapes.length){
            Shape[] newShapes = new Shape[this.shapes.length * 2];
            System.arraycopy(this.shapes, 0, newShapes, 0, this.shapes.length);
            this.shapes = newShapes;
        }
        this.shapes[index] = shape;
        this.index +=1;
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        // 1. Shape와 동일 이름을 가진 요소 삭제
        for(int i = 0; i < this.index - 1; i++){
            if(this.shapes[i].equals(shape)){
                this.shapes[i] = null;
                // 2. 정렬 해주기
                for(int j = i; j < this.index - 1; j++){
                    // 2.1. length -1 요소 들 정렬 해주기
                    this.shapes[j] = this.shapes[j +1];
                }
                this.shapes[this.index- 1] = this.shapes[this.index];
                this.index -=1;
                return;
            }
        }
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for(int i = 0; i <= this.index - 1; i++){
            System.out.println("Shape : " + this.shapes[i].getClass().getSimpleName());
            System.out.println("Area : " + this.shapes[i].calculateArea());
            System.out.println("Perimeter : " + this.shapes[i].calculatePerimeter());
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sumOfArea = 0;
        for(int i = 0; i <= this.index - 1; i++){
            sumOfArea += this.shapes[i].calculateArea();
        }
        return sumOfArea;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sumOfPerimeter = 0;
        for(int i = 0; i <= this.index - 1; i++){
            sumOfPerimeter += this.shapes[i].calculatePerimeter();
        }
        return sumOfPerimeter;
    }
}