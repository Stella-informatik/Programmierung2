package ersteunit;

import java.util.Objects;

public class RationaleZahl {
		private final int z;
		private final int n;

		public RationaleZahl(int z, int n) {
			if (n == 0)
				throw new ArithmeticException();
			if (n < 0) {
				z = -z;
				n = -n;
			}
			int ggt = ggt(Math.abs(z), Math.abs(z));
			this.z = z / ggt;
			this.n = n / ggt;
		}

		public int getZ() {
			return z;
		}

		public int getN() {
			return n;
		}

		private int ggt(int x, int y) {
			if (x == 0) {
				return y;
			} else {
				while (y != 0) {
					if (x > y) {
						x = x - y;
					} else {
						y = y - x;
					}
				}
				return x;
			}
		}

		@Override
		public String toString() {
			return z + "/" + n;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj instanceof RationaleZahl other) {
				return Objects.equals(this.z, other.z) && Objects.equals(this.n, other.n);
			} else {
				return false;
			}
		}
}
