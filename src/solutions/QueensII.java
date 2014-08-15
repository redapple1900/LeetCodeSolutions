package solutions;

public class QueensII {

	int total, limit;

	public int totalNQueens(int n) {
		total = 0;
		limit = (1 << n) - 1;
		dfs(0, 0, 0);
		return total;
	}

	private void dfs(int h, int r, int l) {
		if (h == limit) {
			total++;
			return;
		}

		int pos = limit & (~(h | r | l));

		while (pos > 0) {
			int p = pos & (-pos);

			pos -= p;

			dfs(h + p, (r + p) >> 1, (l + p) << 1);

		}
	}
}
