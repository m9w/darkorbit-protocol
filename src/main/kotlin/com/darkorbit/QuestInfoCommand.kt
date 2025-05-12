package com.darkorbit

interface QuestInfoCommand : ProtocolPacket {
	var definition: QuestDefinitionModule
	var playersRating: QuestChallengeRatingModule
	var ratings: MutableList<QuestChallengeRatingModule>
}
