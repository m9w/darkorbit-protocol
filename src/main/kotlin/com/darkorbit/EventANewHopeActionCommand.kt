package com.darkorbit

interface EventANewHopeActionCommand : ProtocolPacket {
	var activityStatus: EventANewHopeActionCommandActivityStatus
	var bootKeyAmount: Long
	var bootKeyLootId: String
	var errorMessage: BaseStackCommand
	var eventANewHopeContributorListCommand: EventANewHopeContributorListCommand
	var eventANewHopeQuestCommand: EventANewHopeQuestCommand
	var inviterId: Int
	var inviterName: String
	var returnType: EventANewHopeActionCommandReturnType
}
