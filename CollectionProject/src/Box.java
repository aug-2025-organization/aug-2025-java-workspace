import java.util.Objects;

public class Box implements Comparable{
	private int id;
	private int height;
	private int width;
	private int length;
	private String color;

	public Box(int id, int height, int width, int length) {
		super();
		this.id = id;
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public Box(int id, int height, int width, int length, String color) {
		super();
		this.id = id;
		this.height = height;
		this.width = width;
		this.length = length;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, length, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		return height == other.height && length == other.length && width == other.width;
	}

	@Override
	public String toString() {
		return "Box [id=" + id + ", height=" + height + ", width=" + width + ", length=" + length + ", color=" + color
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		//int currentVolume = this.length * this.width * this.height;
		Box otherBox = (Box) o;
		//int otherVolume = otherBox.length * otherBox.width * otherBox.height;
		//return currentVolume - otherVolume;
		if((this.length - otherBox.length) == 0) {
			if((this.width - otherBox.width) == 0) {
				return this.height - otherBox.height;
			} else {
				return this.width - otherBox.width;
			}
		}else {
			return this.length - otherBox.length;
		}
	}
}
