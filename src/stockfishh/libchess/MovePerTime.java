/*
 * Copyright 2017 Ben-Hur Carlos Vieira Langoni Junior
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package stockfishh.libchess;

public class MovePerTime {

	private int moves;
	private long milliseconds;

	public MovePerTime() {

	}

	public MovePerTime(int moves, long milliseconds) {
		this.moves = moves;
		this.milliseconds = milliseconds;
	}

	public int getMoves() {
		return moves;
	}

	public void setMoves(int moves) {
		this.moves = moves;
	}

	public long getMilliseconds() {
		return milliseconds;
	}

	public void setMilliseconds(long milliseconds) {
		this.milliseconds = milliseconds;
	}

	public String toPGNString() {
		return getMoves() + "/" + (getMilliseconds() / 1000);
	}

	@Override
	public String toString() {
		return getMoves() + " Moves / " + (getMilliseconds() / 1000) + " Sec";
	}

}
