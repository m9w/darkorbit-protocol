package com.darkorbit

interface WordPuzzleLetterModule : ProtocolPacket {
	var letterIndex: Int
	var letterValue: String
}
