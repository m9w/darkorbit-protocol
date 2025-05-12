package com.darkorbit

interface HintWindowAddComand : ProtocolPacket {
	var addToList: Boolean
	var openedFromArchive: Boolean
	var paymentLink: String
	var soundModule: SoundTriggerModule
	var visibility: HintWindowVisibility
	var window: HintWindowModule
}
