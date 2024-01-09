package DummyFile;

class InputCheck {

	private String str;

	//コンストラクタにthisを設置
	//アクセス修飾子を変更
	InputCheck(String str) {
		if (str == null) {
			str = "";
		}
		this.str = str;
	}

	protected boolean isNumeric() {
		if (this.str == "") {
			return false;
		}

		for (int i = 0; i < this.str.length(); i++) {
			char c = this.str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

	//文字列の長さを10文字「以下」に変更
	//入力値が0の場合も除去
	protected boolean checkSize() {
		if (this.str.length() < 10) {
			int size = Math.abs(Integer.parseInt(this.str));
			if (size > 0 && size <= 1024 * 1024 * 100) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}
}
