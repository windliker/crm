package com.windlike.crm.foxnrabbit.field;

import java.util.ArrayList;
import java.util.List;

import com.windlike.crm.foxnrabbit.cell.Cell;

public class Field {
    private static final Location[] adjacent = {
                    new Location(-1, 1),
                    new Location(-1, 0),
                    new Location(-1,1),
                    new Location(0, -1),
                    new Location(0, 0),
                    new Location(0, 1),
                    new Location(1, -1),
                    new Location(1, 0),
                    new Location(1, 1),
    };
	private int width;
	private int height;
	private Cell[][] field;
	
	public Field(int width, int height) {
		this.width = width;
		this.height = height;
		field = new Cell[height][width];
	}
	
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	public Cell place(int row, int col, Cell o) {
		Cell ret = field[row][col];
		field[row][col] = o;
		return ret;
	}
	
	public Cell get(int row, int col) {
		return field[row][col];
	}
	
	public Cell[] getNeighbour(int row, int col) {
		ArrayList<Cell> list = new ArrayList<Cell>();
		for ( int i=-1; i<2; i++ ) {
			for ( int j=-1; j<2; j++ ) {
				int r = row+i;
				int c = col+j;
				if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) ) {
					list.add(field[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);
	}
	
	public void clear() {
		for ( int i=0; i<height; i++ ) {
			for ( int j=0; j<width; j++ ) {
				field[i][j] = null;
			}
		}
	}
	
    public boolean placeRandomAdj(int row, int col, Cell cell) {
        boolean ret = false;
        Location[] freeAdj = this.getFreeNeighbour(row, col);
        if (freeAdj.length > 0) {
            int idx = (int)(Math.random() * freeAdj.length);
            field[freeAdj[idx].getRow()][freeAdj[idx].getCol()] = cell;
            ret = true;
        }
        return ret;
    }

    public Cell remove(int row, int col) {
        Cell ret = field[row][col];
        field[row][col] = null;
        return ret;
    }
    
    public void remove(Cell cell) {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                // 找到cell 使其为null
                if (field[row][col] == cell) {
                    field[row][col] = null;
                    break;
                }
            }
        }
    }
    
    public Location[] getFreeNeighbour(int row, int col) {
        List<Location> list = new ArrayList<Location>();
        for ( int i=-1; i<2; i++ ) {
            for ( int j=-1; j<2; j++ ) {
                int r = row+i;
                int c = col+j;
                if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) ) {
                    list.add((Location) field[r][c]);
                }
            }
        }
        return list.toArray(new Location[list.size()]);
    }

    public void move(int row, int col, Location loc) {
        // TODO Auto-generated method stub
        
    }
}
