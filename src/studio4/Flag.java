package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(100,150,200);
		StdDraw.filledRectangle(0.475, 0.5, 0.4, 0.25);
		StdDraw.setPenColor(Color.black);
		StdDraw.rectangle(0.475, 0.5, 0.4, 0.25);
		StdDraw.setPenColor(Color.white);
		StdDraw.filledRectangle(0.475, 0.5, 0.4, 0.09);
		StdDraw.setPenColor(253, 218, 13);
		StdDraw.filledRectangle(0.475, 0.67, 0.4, 0.02);
		StdDraw.filledRectangle(0.475, 0.33, 0.4, 0.02);
		StdDraw.setPenColor(100,150,200);
		StdDraw.filledRectangle(0.475, 0.67, 0.4, 0.01);
		StdDraw.filledRectangle(0.475, 0.33, 0.4, 0.01);
		StdDraw.setPenColor(253, 218, 13);
		double triangle1X[] = {0.16, 0.11, 0.21};
		double trangle1Y[] = {0.58, 0.45, 0.45};
		StdDraw.filledPolygon(triangle1X, trangle1Y);
		double triangle1BX[] = {0.16, 0.11, 0.21};
		double trangle1BY[] = {0.41, 0.53, 0.53};
		StdDraw.filledPolygon(triangle1BX, trangle1BY);
		double triangle2X[] = {0.28, 0.23, 0.34};
		double trangle2Y[] = {0.58, 0.45, 0.45};
		StdDraw.filledPolygon(triangle2X, trangle2Y);
		double triangle2BX[] = {0.28, 0.23, 0.34};
		double trangle2BY[] = {0.41, 0.53, 0.53};
		StdDraw.filledPolygon(triangle2BX, trangle2BY);
		double triangle3X[] = {0.40, 0.35, 0.46};
		double trangle3Y[] = {0.58, 0.45, 0.45};
		StdDraw.filledPolygon(triangle3X, trangle3Y);
		double triangle3BX[] = {0.40, 0.35, 0.46};
		double trangle3BY[] = {0.41, 0.53, 0.53};
		StdDraw.filledPolygon(triangle3BX, trangle3BY);
		double triangle4X[] = {0.52, 0.47, 0.58};
		double trangle4Y[] = {0.58, 0.45, 0.45};
		StdDraw.filledPolygon(triangle4X, trangle4Y);
		double triangle4BX[] = {0.52, 0.47, 0.58};
		double trangle4BY[] = {0.41, 0.53, 0.53};
		StdDraw.filledPolygon(triangle4BX, trangle4BY);
		double triangle5X[] = {0.64, 0.59, 0.70};
		double trangle5Y[] = {0.58, 0.45, 0.45};
		StdDraw.filledPolygon(triangle5X, trangle5Y);
		double triangle5BX[] =  {0.64, 0.59, 0.70};
		double trangle5BY[] = {0.41, 0.53, 0.53};
		StdDraw.filledPolygon(triangle5BX, trangle5BY);
		double triangle6X[] = {0.76, 0.71, 0.82};
		double trangle6Y[] = {0.58, 0.45, 0.45};
		StdDraw.filledPolygon(triangle6X, trangle6Y);
		double triangle6BX[] =  {0.76, 0.71, 0.82};
		double trangle6BY[] = {0.41, 0.53, 0.53};
		StdDraw.filledPolygon(triangle6BX, trangle6BY);
	
		
	}
}