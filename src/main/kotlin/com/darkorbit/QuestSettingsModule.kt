package com.darkorbit

interface QuestSettingsModule : ProtocolPacket {
	var attemptedFilter: Boolean
	var availableFilter: Boolean
	var completedFilter: Boolean
	var inLevelRangeFilter: Boolean
	var unattemptedFilter: Boolean
	var unavailableFilter: Boolean
}
