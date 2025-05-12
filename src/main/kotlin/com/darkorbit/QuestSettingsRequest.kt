package com.darkorbit

interface QuestSettingsRequest : ProtocolPacket {
	var attemptedFilter: Boolean
	var availableFilter: Boolean
	var completedFilter: Boolean
	var inLevelRangeFilter: Boolean
	var unattemptedFilter: Boolean
	var unavailableFilter: Boolean
}
