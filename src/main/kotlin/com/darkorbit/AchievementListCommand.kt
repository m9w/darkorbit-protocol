package com.darkorbit

interface AchievementListCommand : ProtocolPacket {
	var displayTitleId: Int
	var list: MutableList<AchievementInfoCommand>
	var nextAchievements: MutableList<AchievementInfoCommand>
	var titleCommandList: MutableList<AchievementTitleCommand>
	var unlockAchievements1: MutableList<AchievementInfoCommand>
	var unlockAchievements2: MutableList<AchievementInfoCommand>
}
