public class BoxGenerics<T extends Number, K extends String> {
	private T length;
	private T breadth;
	private T height;
	private K color;

	public BoxGenerics(T length, T breadth, T height, K color) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.color = color;
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getBreadth() {
		return breadth;
	}

	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	public K getColor() {
		return color;
	}

	public void setColor(K color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "BoxGenerics [length=" + length + ", breadth=" + breadth + ", height=" + height + ", color=" + color
				+ "]";
	}
}
