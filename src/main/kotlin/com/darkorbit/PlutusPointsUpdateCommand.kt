package com.darkorbit

interface PlutusPointsUpdateCommand : ProtocolPacket {
	var score: Int
	var scoreEntriesList: MutableList<PlutusScoreEntryModule>
}
