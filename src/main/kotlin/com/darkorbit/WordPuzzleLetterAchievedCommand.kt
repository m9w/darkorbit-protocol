package com.darkorbit

interface WordPuzzleLetterAchievedCommand : ProtocolPacket {
	var complete: Boolean
	var letterValues: MutableList<WordPuzzleLetterModule>
}
