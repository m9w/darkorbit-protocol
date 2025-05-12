package com.darkorbit

interface EventReturnOfHeroActionCommand : ProtocolPacket {
	var activityStatus: EventReturnOfHeroActionCommandActivityStatus
	var bootKeyAmount: Long
	var bootKeyLootId: String
	var errorMessage: BaseStackCommand
	var eventReturnOfHeroContributorListCommand: EventReturnOfHeroContributorListCommand
	var eventReturnOfHeroQuestCommand: EventReturnOfHeroQuestCommand
	var inviterId: Int
	var inviterName: String
	var returnType: EventReturnOfHeroActionCommandReturnType
}
