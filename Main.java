local NEVERLOSE = loadstring(game:HttpGet("https://raw.githubusercontent.com/3345-c-a-t-s-u-s/NEVERLOSE-UI-Nightly/main/source.lua"))()

local function Start(Key)
	     


   
        local NEVERLOSE = loadstring(game:HttpGet("https://raw.githubusercontent.com/3345-c-a-t-s-u-s/NEVERLOSE-UI-Nightly/main/source.lua"))()
local Notification = NEVERLOSE:Notification()

Notification.MaxNotifications = 6

    Notification:Notify("info","رساله عاجله","تم تشغيل السكربت")
    Notification:Notify("warning","تنبيه خطر ","ثباحو😘",4)
        
local NothingLibrary = loadstring(game:HttpGetAsync('https://raw.githubusercontent.com/AstroXTeam/UI-LIB/refs/heads/main/Not%20my%20lib'))();
local Windows = NothingLibrary.new({
	Title = "  ‎‧₊˚ 『 A s t r o X 』 ˚₊‧",
	Description = "卍 By sodium X 卍",
	Keybind = Enum.KeyCode.LeftControl,
	Logo = 'http://www.roblox.com/asset/?id=77914162370351'
})


local TabFrame = Windows:NewTab({
	Title = "〢General ︱",
	Description = "・General Section ‎",
	Icon = "rbxassetid://7733960981"
})

local Section = TabFrame:NewSection({
	Title = " 〘شكيبدي دريد🔥🗣️ 〙",
	Icon = "rbxassetid://7743870134",
	Position = "Left"
})


Section:NewButton({
	Title = "〢Fly・طيران ",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/pro1x1/Fly-scrip/main/Fly%20scrip"))();
	end,
})

Section:NewButton({
	Title = "〢Vfly・طيران بالسياره ̤̮",
	Callback = function()
		

local Flymguiv2 = Instance.new("ScreenGui")

local Drag = Instance.new("Frame")

local FlyFrame = Instance.new("Frame")

local ddnsfbfwewefe = Instance.new("TextButton")

local Speed = Instance.new("TextBox")

local Fly = Instance.new("TextButton")

local Speeed = Instance.new("TextLabel")

local Stat = Instance.new("TextLabel")

local Stat2 = Instance.new("TextLabel")

local Unfly = Instance.new("TextButton")

local Vfly = Instance.new("TextLabel")

local Close = Instance.new("TextButton")

local Minimize = Instance.new("TextButton")

local Flyon = Instance.new("Frame")

local W = Instance.new("TextButton")

local S = Instance.new("TextButton")

--Properties:

Flymguiv2.Name = "Flym gui v2"

Flymguiv2.Parent = game.CoreGui

Flymguiv2.ZIndexBehavior = Enum.ZIndexBehavior.Sibling

Drag.Name = "Drag"

Drag.Parent = Flymguiv2

Drag.Active = true

Drag.BackgroundColor3 = Color3.fromRGB(138,43,226)

Drag.BorderSizePixel = 0

Drag.Draggable = true

Drag.Position = UDim2.new(0.482438415, 0, 0.454874992, 0)

Drag.Size = UDim2.new(0, 237, 0, 27)

FlyFrame.Name = "FlyFrame"

FlyFrame.Parent = Drag

FlyFrame.BackgroundColor3 = Color3.fromRGB(147,112,219)

FlyFrame.BorderSizePixel = 0

FlyFrame.Draggable = true

FlyFrame.Position = UDim2.new(-0.00200000009, 0, 0.989000022, 0)

FlyFrame.Size = UDim2.new(0, 237, 0, 139)

ddnsfbfwewefe.Name = "ddnsfbfwewefe"

ddnsfbfwewefe.Parent = FlyFrame

ddnsfbfwewefe.BackgroundColor3 = Color3.fromRGB(138,43,226)

ddnsfbfwewefe.BorderSizePixel = 0

ddnsfbfwewefe.Position = UDim2.new(-0.000210968778, 0, -0.00395679474, 0)

ddnsfbfwewefe.Size = UDim2.new(0, 237, 0, 27)

ddnsfbfwewefe.Font = Enum.Font.SourceSans

ddnsfbfwewefe.Text = "Sodium Vfly"

ddnsfbfwewefe.TextColor3 = Color3.fromRGB(0,0,0)

ddnsfbfwewefe.TextScaled = true

ddnsfbfwewefe.TextSize = 14.000

ddnsfbfwewefe.TextWrapped = true

Speed.Name = "Speed"

Speed.Parent = FlyFrame

Speed.BackgroundColor3 = Color3.fromRGB(138,43,226)

Speed.BorderColor3 = Color3.fromRGB(0, 0, 191)

Speed.BorderSizePixel = 0

Speed.Position = UDim2.new(0.445025861, 0, 0.402877688, 0)

Speed.Size = UDim2.new(0, 111, 0, 33)

Speed.Font = Enum.Font.SourceSans

Speed.PlaceholderColor3 = Color3.fromRGB(255, 255, 255)

Speed.Text = "50"

Speed.TextColor3 = Color3.fromRGB(0,0,0)

Speed.TextScaled = true

Speed.TextSize = 14.000

Speed.TextWrapped = true

Fly.Name = "Fly"

Fly.Parent = FlyFrame

Fly.BackgroundColor3 = Color3.fromRGB(138,43,226)

Fly.BorderSizePixel = 0

Fly.Position = UDim2.new(0.0759493634, 0, 0.705797076, 0)

Fly.Size = UDim2.new(0, 199, 0, 32)

Fly.Font = Enum.Font.SourceSans

Fly.Text = "Enable"

Fly.TextColor3 = Color3.fromRGB(0,0,0)

Fly.TextScaled = true

Fly.TextSize = 14.000

Fly.TextWrapped = true

Fly.MouseButton1Click:Connect(function()

	local HumanoidRP = game.Players.LocalPlayer.Character.HumanoidRootPart	Fly.Visible = false

	Stat2.Text = "On"

	Stat2.TextColor3 = Color3.fromRGB(0, 255, 0)

	Unfly.Visible = true

	Flyon.Visible = true

	local BV = Instance.new("BodyVelocity",HumanoidRP)

	local BG = Instance.new("BodyGyro",HumanoidRP)

	BV.MaxForce = Vector3.new(math.huge,math.huge,math.huge)

	game:GetService('RunService').RenderStepped:connect(function()

	BG.MaxTorque = Vector3.new(math.huge,math.huge,math.huge)

	BG.D = 5000

	BG.P = 100000

	BG.CFrame = game.Workspace.CurrentCamera.CFrame

	end)

end)

Speeed.Name = "Speeed"

Speeed.Parent = FlyFrame

Speeed.BackgroundColor3 = Color3.fromRGB(138,43,226)

Speeed.BorderSizePixel = 0

Speeed.Position = UDim2.new(0.0759493634, 0, 0.402877688, 0)

Speeed.Size = UDim2.new(0, 87, 0, 32)

Speeed.ZIndex = 0

Speeed.Font = Enum.Font.SourceSans

Speeed.Text = "Speed:"

Speeed.TextColor3 = Color3.fromRGB(0,0,0)

Speeed.TextScaled = true

Speeed.TextSize = 14.000

Speeed.TextWrapped = true

Stat.Name = "Stat"

Stat.Parent = FlyFrame

Stat.BackgroundColor3 = Color3.fromRGB(138,43,226)

Stat.BorderSizePixel = 0

Stat.Position = UDim2.new(0.299983799, 0, 0.239817441, 0)

Stat.Size = UDim2.new(0, 85, 0, 15)

Stat.Font = Enum.Font.SourceSans

Stat.Text = "Status:"

Stat.TextColor3 = Color3.fromRGB(0,0,0)

Stat.TextScaled = true

Stat.TextSize = 14.000

Stat.TextWrapped = true

Stat2.Name = "Stat2"

Stat2.Parent = FlyFrame

Stat2.BackgroundColor3 = Color3.fromRGB(138,43,226)

Stat2.BorderSizePixel = 0

Stat2.Position = UDim2.new(0.546535194, 0, 0.239817441, 0)

Stat2.Size = UDim2.new(0, 27, 0, 15)

Stat2.Font = Enum.Font.SourceSans

Stat2.Text = "Off"

Stat2.TextColor3 = Color3.fromRGB(255, 0, 0)

Stat2.TextScaled = true

Stat2.TextSize = 14.000

Stat2.TextWrapped = true

Unfly.Name = "Unfly"

Unfly.Parent = FlyFrame

Unfly.BackgroundColor3 = Color3.fromRGB(138,43,226)

Unfly.BorderSizePixel = 0

Unfly.Position = UDim2.new(0.0759493634, 0, 0.705797076, 0)

Unfly.Size = UDim2.new(0, 199, 0, 32)

Unfly.Visible = false

Unfly.Font = Enum.Font.SourceSans

Unfly.Text = "Disable"

Unfly.TextColor3 = Color3.fromRGB(0,0,0)

Unfly.TextScaled = true

Unfly.TextSize = 14.000

Unfly.TextWrapped = true

Unfly.MouseButton1Click:Connect(function()

	local HumanoidRP = game.Players.LocalPlayer.Character.HumanoidRootPart

	Fly.Visible = true

	Stat2.Text = "Off"

	Stat2.TextColor3 = Color3.fromRGB(255, 0, 0)

	wait()

	Unfly.Visible = false

	Flyon.Visible = false

	HumanoidRP:FindFirstChildOfClass("BodyVelocity"):Destroy()

	HumanoidRP:FindFirstChildOfClass("BodyGyro"):Destroy()

end)

Vfly.Name = "Vfly"

Vfly.Parent = Drag

Vfly.BackgroundColor3 = Color3.fromRGB(138,43,226)

Vfly.BorderSizePixel = 0

Vfly.Size = UDim2.new(0, 57, 0, 27)

Vfly.Font = Enum.Font.SourceSans

Vfly.Text = "VFly"

Vfly.TextColor3 = Color3.fromRGB(0,0,0)

Vfly.TextScaled = true

Vfly.TextSize = 14.000

Vfly.TextWrapped = true

Close.Name = "Close"

Close.Parent = Drag

Close.BackgroundColor3 = Color3.fromRGB(138,43,226)

Close.BorderSizePixel = 0

Close.Position = UDim2.new(0.875, 0, 0, 0)

Close.Size = UDim2.new(0, 27, 0, 27)

Close.Font = Enum.Font.SourceSans

Close.Text = "X"

Close.TextColor3 = Color3.fromRGB(0,0,0)

Close.TextScaled = true

Close.TextSize = 14.000

Close.TextWrapped = true

Close.MouseButton1Click:Connect(function()

	Flymguiv2:Destroy()

end)

Minimize.Name = "Minimize"

Minimize.Parent = Drag

Minimize.BackgroundColor3 = Color3.fromRGB(138,43,226)

Minimize.BorderSizePixel = 0

Minimize.Position = UDim2.new(0.75, 0, 0, 0)

Minimize.Size = UDim2.new(0, 27, 0, 27)

Minimize.Font = Enum.Font.SourceSans

Minimize.Text = "-"

Minimize.TextColor3 = Color3.fromRGB(0,0,0)

Minimize.TextScaled = true

Minimize.TextSize = 14.000

Minimize.TextWrapped = true

function Mini()

	if Minimize.Text == "-" then

		Minimize.Text = "+"

		FlyFrame.Visible = false

	elseif Minimize.Text == "+" then

		Minimize.Text = "-"

		FlyFrame.Visible = true

	end

end

Minimize.MouseButton1Click:Connect(Mini)

Flyon.Name = "Fly on"

Flyon.Parent = Flymguiv2

Flyon.BackgroundColor3 = Color3.fromRGB(0, 0, 0)

Flyon.BorderSizePixel = 0

Flyon.Position = UDim2.new(0.117647067, 0, 0.550284624, 0)

Flyon.Size = UDim2.new(0.148000002, 0, 0.314999998, 0)

Flyon.Visible = false

Flyon.Active = true

Flyon.Draggable = true

W.Name = "W"

W.Parent = Flyon

W.BackgroundColor3 = Color3.fromRGB(138,43,226)

W.BorderSizePixel = 0

W.Position = UDim2.new(0.134719521, 0, 0.0152013302, 0)

W.Size = UDim2.new(0.708999991, 0, 0.499000013, 0)

W.Font = Enum.Font.SourceSans

W.Text = "^"

W.TextColor3 = Color3.fromRGB(0,0,0)

W.TextScaled = true

W.TextSize = 14.000

W.TextWrapped = true

W.TouchLongPress:Connect(function()

	local HumanoidRP = game.Players.LocalPlayer.Character.HumanoidRootPart

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * 0

end)

W.MouseButton1Click:Connect(function()

	local HumanoidRP = game.Players.LocalPlayer.Character.HumanoidRootPart

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * 0

end)

S.Name = "S"

S.Parent = Flyon

S.BackgroundColor3 = Color3.fromRGB(138,43,226)

S.BorderSizePixel = 0

S.Position = UDim2.new(0.134000003, 0, 0.479999989, 0)

S.Rotation = 180.000

S.Size = UDim2.new(0.708999991, 0, 0.499000013, 0)

S.Font = Enum.Font.SourceSans

S.Text = "^"

S.TextColor3 = Color3.fromRGB(0,0,0)

S.TextScaled = true

S.TextSize = 14.000

S.TextWrapped = true

S.TouchLongPress:Connect(function()

	local HumanoidRP = game.Players.LocalPlayer.Character.HumanoidRootPart

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * 0

end)

S.MouseButton1Click:Connect(function()

	local HumanoidRP = game.Players.LocalPlayer.Character.HumanoidRootPart

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * -Speed.Text

	wait(.1)

	HumanoidRP.BodyVelocity.Velocity = game.Workspace.CurrentCamera.CFrame.LookVector * 0

end)
	end,
})


Section:NewButton({
	Title = "〢shift lock・قفل",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/SPDM-Team/Arceus-X-NEO-public/main/Scripts/ArceusX-Shiftlock.lua"))()
	end,
})

Section:NewButton({
	Title = "〢Spam・سبام",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/game-hax/uca/main/release/uca.min.lua"))()
	end,
})

local Section = TabFrame:NewSection({
	Title = "〢Some Function ᵕ̈ ",
	Icon = "rbxassetid://7733765398",
	Position = "Right"
})

Section:NewToggle({
	Title = " 『 AntiVoid 』ᵕ̈ ",
	Default = false,
	Callback = function(tr)
		getgenv().AntiVoid = true -- // toggle it on and off

-- // Services
local Players = game:GetService("Players")

-- // Vars
local LocalPlayer = Players.LocalPlayer

-- // Check if anyone has the same handle as you
local function toolMatch(Handle)
    local allPlayers = Players:GetPlayers()
    for i = 1, #allPlayers do
        -- // Vars
        local Player = allPlayers[i]
        if (Player == LocalPlayer) then continue end -- // ignore local player

        -- // Vars
        local Character = Player.Character
        local RightArm = Character:WaitForChild("Right Arm")
        local RightGrip = RightArm:FindFirstChild("RightGrip")

        -- // Check if they share the same Part1 Handle of the Grip
        if (RightGrip and RightGrip.Part1 == Handle) then
            return Player
        end
    end
end

-- // Manager
local function onCharacter(Character)
    local RightArm = Character:WaitForChild("Right Arm")

    -- // See when you equip something
    RightArm.ChildAdded:Connect(function(child)
        if (child:IsA("Weld") and child.Name == "RightGrip" and getgenv().AntiVoid) then
            -- // Vars
            local ConnectedHandle = child.Part1

            -- // Check if someone else has something equipped too with the same handle as you
            local matched = toolMatch(ConnectedHandle)

            -- // Destroy the tool, if someone is voiding you
            if (matched) then
                ConnectedHandle.Parent:Destroy()
                print(matched, "just tried to void you lol!")
            end
        end
    end)
end

-- // Initialise the script
onCharacter(LocalPlayer.Character)
LocalPlayer.CharacterAdded:Connect(onCharacter)
	end,
})

Section:NewToggle({
	Title = " 『 AntiAfk 』ᵕ̈ ",
	Default = false,
	Callback = function(tr)
		game:service'Players'.LocalPlayer.Idled:connect(function()
bb:CaptureController()bb:ClickButton2(Vector2.new())
ab.Text="You went idle and ROBLOX tried to kick you but we reflected it!"wait(2)ab.Text="Script Re-Enabled"end)
	end,
	})
Section:NewButton({
	Title = "〢Invisible Buttonᵕ̈ ",
	Callback = function()
		loadstring(game:HttpGet('https://pastebin.com/raw/3Rnd9rHf'))()
	end,
})

local Section = TabFrame:NewSection({
	Title = "〘 Simple Function 〙",
	Icon = "rbxassetid://7733765398",
	Position = "Right"
	})
	
	Section:NewSlider({
	Title = "〢Speed changer ᵕ̈  ",
	Min = 16,
	Max = 650,
	Default = 16,
	Callback = function(a)
		game.Players.LocalPlayer.Character.Humanoid.WalkSpeed = a
	end,
})

Section:NewButton({
	Title = "〢Res Speed ",
	Callback = function()
		game.Players.LocalPlayer.Character.Humanoid.WalkSpeed = 16
	end,
})

	Section:NewButton({
	Title = " 〢『 Rejoin 』ᵕ̈ ",
	Callback = function()
		local ts = game:GetService("TeleportService")

local p = game:GetService("Players").LocalPlayer

 

ts:Teleport(game.PlaceId, p)
	end,
})
	
	Section:NewButton({
	Title = "〢『 Server Hop 』ᵕ̈ ",
	Callback = function()
		-- Made By JamJam
local PlaceID = game.PlaceId
local AllIDs = {}
local foundAnything = ""
local actualHour = os.date("!*t").hour
local Deleted = false

local File = pcall(function()
    AllIDs = game:GetService('HttpService'):JSONDecode(readfile("NotSameServers.json"))
end)

if not File then
    table.insert(AllIDs, actualHour)
    writefile("NotSameServers.json", game:GetService('HttpService'):JSONEncode(AllIDs))
end

function TPReturner()
    local Site
    if foundAnything == "" then
        Site = game.HttpService:JSONDecode(game:HttpGet('https://games.roblox.com/v1/games/' .. PlaceID .. '/servers/Public?sortOrder=Asc&limit=100'))
    else
        Site = game.HttpService:JSONDecode(game:HttpGet('https://games.roblox.com/v1/games/' .. PlaceID .. '/servers/Public?sortOrder=Asc&limit=100&cursor=' .. foundAnything))
    end

    local ID = ""
    if Site.nextPageCursor and Site.nextPageCursor ~= "null" and Site.nextPageCursor ~= nil then
        foundAnything = Site.nextPageCursor
    end

    local num = 0
    for i, v in pairs(Site.data) do
        local Possible = true
        ID = tostring(v.id)
        if tonumber(v.maxPlayers) > tonumber(v.playing) then
            for _, Existing in pairs(AllIDs) do
                if num ~= 0 then
                    if ID == tostring(Existing) then
                        Possible = false
                    end
                else
                    if tonumber(actualHour) ~= tonumber(Existing) then
                        local delFile = pcall(function()
                            delfile("NotSameServers.json")
                            AllIDs = {}
                            table.insert(AllIDs, actualHour)
                        end)
                    end
                end
                num = num + 1
            end
            if Possible == true then
                table.insert(AllIDs, ID)
                wait()
                pcall(function()
                    writefile("NotSameServers.json", game:GetService('HttpService'):JSONEncode(AllIDs))
                    wait()
                    game:GetService("TeleportService"):TeleportToPlaceInstance(PlaceID, ID, game.Players.LocalPlayer)
                end)
                wait(4)
            end
        end
    end
end

function Teleport()
    while wait() do
        pcall(function()
            TPReturner()
            if foundAnything ~= "" then
                TPReturner()
            end
        end)
    end
end

-- If you'd like to use a script before server hopping (like an automatic chest collector), you can put the Teleport() after it collected everything.
Teleport()
	end,
})
	
	Section:NewButton({
	Title = "〢 『 Tp lower player Serv 』ᵕ̈ ",
	Callback = function()
		local Http = game:GetService("HttpService")
local TPS = game:GetService("TeleportService")
local Api = "https://games.roblox.com/v1/games/"

local _place = game.PlaceId
local _servers = Api.._place.."/servers/Public?sortOrder=Asc&limit=100"
function ListServers(cursor)
   local Raw = game:HttpGet(_servers .. ((cursor and "&cursor="..cursor) or ""))
   return Http:JSONDecode(Raw)
end

local Server, Next; repeat
   local Servers = ListServers(Next)
   Server = Servers.data[1]
   Next = Servers.nextPageCursor
until Server

TPS:TeleportToPlaceInstance(_place,Server.id,game:GetService('Players').LocalPlayer)
	end,
})
	
	Section:NewButton({
	Title = " 〢 Chat Logs ",
	Callback = function()
		loadstring(game:HttpGet("https://pastebin.com/raw/c19nK554"))()
	end,
})

Section:NewButton({
	Title = " 〢 Anti-Chatlog ",
	Callback = function()
		loadstring(game:HttpGet("https://pastebin.com/raw/zdSvTA1z"))()
	end,
})
local Section = TabFrame:NewSection({
	Title = "〘 Anti Function 〙ᵕ̈ ",
	Icon = "rbxassetid://7733765398",
	Position = "Left"
})
	
Section:NewToggle({
	Title = "AntiSit",
	Default = false,
	Callback = function(Seat)
		local enabled = true
local seats = {}
for _, seat in next, workspace:GetDescendants() do
	if seat:IsA("Seat") then
		seats[seat] = true
	end
end

workspace.DescendantAdded:connect(function(seat)
	if seat:IsA("Seat") then
		seats[seat] = true
		seat.Disabled = not enabled
	end
end)

workspace.DescendantRemoving:connect(function(seat)
	if seat:IsA("Seat") then
		seats[seat] = nil
	end
end)

setEnabled = function(newEnabled)
	if newEnabled == enabled then
		return
	end
	enabled = newEnabled
	for seat, _ in next, seats do
		seat.Disabled = not enabled
	end
end

---

setEnabled(false)
	end,
})

local Section = TabFrame:NewSection({
	Title = "〢〘 Esp Function 〙ᵕ̈ ",
	Icon = "rbxassetid://7733765398",
	Position = "Left"
})


	local TabFrame = Windows:NewTab({
	Title = "〢Admin ⌞🧑‍💻⌝ ",
	Description = "‎‧₊˚『 Admin functionᵕ̈ 』˚₊‧",
	Icon = "rbxassetid://7734056608"
})

local Section = TabFrame:NewSection({
	Title = "〢〘هاكات فردة كعب يساوي دريد🔥〙",
	Icon = "rbxassetid://7733765398",
	Position = "Left"
})


Section:NewButton({
	Title = " 〢 Admin v3",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/BloodyBurns/Hex/main/Iv%20Admin%20v3.lua"))()
	end,
})

Section:NewButton({
	Title = " 〢 infinite field ",
	Callback = function()
		loadstring(game:HttpGet('https://raw.githubusercontent.com/EdgeIY/infiniteyield/master/source'))()
	end,
})


Section:NewButton({
	Title = " 〢 Nameless Admin",
	Callback = function()
		loadstring(game:HttpGet("https://scriptblox.com/raw/Universal-Script-Nameless-Admin-no-byfron-ui-11288"))()
	end,
})

Section:NewButton({
	Title = " 〢 place saver",
	Callback = function()
		loadstring(game:HttpGet(('https://raw.githubusercontent.com/0Ben1/fe/main/Tp%20Place%20GUI'),true))()
	end,
})

local Section = TabFrame:NewSection({
	Title = "〢〘 whata Sigma 🤫〙",
	Icon = "rbxassetid://7734058345",
	Position = "Right"
})

Section:NewDropdown({
	Title = "AntiLag",
	Data = {1},
	Default = Auto,
	Callback = function(a)
		local ToDisable = {
	Textures = true,
	VisualEffects = true,
	Parts = true,
	Particles = true,
	Sky = true
}

local ToEnable = {
	FullBright = false
}

local Stuff = {}

for _, v in next, game:GetDescendants() do
	if ToDisable.Parts then
		if v:IsA("Part") or v:IsA("Union") or v:IsA("BasePart") then
			v.Material = Enum.Material.SmoothPlastic
			table.insert(Stuff, 1, v)
		end
	end
	
	if ToDisable.Particles then
		if v:IsA("ParticleEmitter") or v:IsA("Smoke") or v:IsA("Explosion") or v:IsA("Sparkles") or v:IsA("Fire") then
			v.Enabled = false
			table.insert(Stuff, 1, v)
		end
	end
	
	if ToDisable.VisualEffects then
		if v:IsA("BloomEffect") or v:IsA("BlurEffect") or v:IsA("DepthOfFieldEffect") or v:IsA("SunRaysEffect") then
			v.Enabled = false
			table.insert(Stuff, 1, v)
		end
	end
	
	if ToDisable.Textures then
		if v:IsA("Decal") or v:IsA("Texture") then
			v.Texture = ""
			table.insert(Stuff, 1, v)
		end
	end
	
	if ToDisable.Sky then
		if v:IsA("Sky") then
			v.Parent = nil
			table.insert(Stuff, 1, v)
		end
	end
end

game:GetService("TestService"):Message("Effects Disabler Script : Successfully disabled "..#Stuff.." assets / effects. Settings :")

for i, v in next, ToDisable do
	print(tostring(i)..": "..tostring(v))
end

if ToEnable.FullBright then
    local Lighting = game:GetService("Lighting")
    
    Lighting.FogColor = Color3.fromRGB(255, 255, 255)
    Lighting.FogEnd = math.huge
    Lighting.FogStart = math.huge
    Lighting.Ambient = Color3.fromRGB(255, 255, 255)
    Lighting.Brightness = 5
    Lighting.ColorShift_Bottom = Color3.fromRGB(255, 255, 255)
    Lighting.ColorShift_Top = Color3.fromRGB(255, 255, 255)
    Lighting.OutdoorAmbient = Color3.fromRGB(255, 255, 255)
    Lighting.Outlines = true
end
	end,
})

Section:NewButton({
	Title = "SX Admin",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/NotAtomz/SX-FE-ADMIN/refs/heads/main/Freeversion"))()
	end,
})

Section:NewButton({
	Title = "Sx Admin \ Old",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/NotAtomz/SX-Admin/refs/heads/main/old"))()
	end,
})


Section:NewButton({
	Title = "Anti Fling \ Better Version",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/NotAtomz/Atom-Scripts/refs/heads/main/anti%20fling"))()
	end,
})

Section:NewButton({
	Title = "Tomada UI \ Big",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/NotAtomz/tomada-ui-commands-gui/refs/heads/main/main"))()
	end,
})

Section:NewButton({
	Title = "AtomA Admin ",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/NotAtomz/Atom-Admin/refs/heads/main/Admin"))()
	end,
})

Section:NewButton({
	Title = "Devz Admin",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/NotAtomz/Devs-Admin/refs/heads/main/main"))()
	end,
})


local TabFrame = Windows:NewTab({
	Title = "〢Brookhaven ⌞🏘️⌝",
	Description = "‎‧₊˚『Brookhaven Fuction』˚₊‧",
	Icon = "rbxassetid://8997387937"
})

local Section = TabFrame:NewSection({
	Title = "〢〘 هتلر نازي حبيبي غالي درودي 〙☄",
	Icon = "rbxassetid://7733765398",
	Position = "Left"
})


Section:NewButton({
	Title = " 〢 f0rtuit0us hub",
	Callback = function()
		local syn = getgenv().syn
getgenv().syn = false

loadstring(game:HttpGet("https://raw.githubusercontent.com/scawy-haxor/-f0rtuit0us-hub/09693e7316ecca9950b20ffd093d4f6a70861a70/f0rtuit0us%20hub"))()

getgenv().syn = syn
	end,
})

Section:NewButton({
	Title = "〢 Redz hub",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/REDzHUB/REDzHUB/main/REDzHUB"))()
	end,
})


Section:NewButton({
	Title = "〢 R4D Hub",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/M1ZZ001/BrookhavenR4D/main/Brookhaven%20R4D%20Script"))()
	end,
})

Section:NewButton({
	Title = "〢 Salvatore Hub",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/RFR-R1CH4RD/Loader/main/Salvatore.lua"))()
	end,
})


Section:NewButton({
	Title = "〢 Darkness Hub",
	Callback = function()
		loadstring(game:HttpGet('https://raw.githubusercontent.com/TheDarkoneMarcillisePex/Other-Scripts/main/Brook%20Haven%20Gui'))()
	end,
})
local Section = TabFrame:NewSection({
	Title = "〢〘More \ المزيد〙 ᵕ̈ ",
	Icon = "rbxassetid://7733765398",
	Position = "Right"
})

Section:NewButton({
	Title = "〢 SanderX Hub",
	Callback = function()
		local syn = getgenv().syn
getgenv().syn = false

loadstring(game:HttpGet(('https://raw.githubusercontent.com/kigredns/sanderXNewVersion/main/sanderX')))()

getgenv().syn = syn
	end,
})


Section:NewButton({
	Title = "〢 Silent Hub",
	Callback = function()
		loadstring(game:HttpGet('https://raw.githubusercontent.com/SilentExpl/Loader-Source-/main/SilentHub-BrookhavenRP.md'))()
	end,
})

Section:NewButton({
	Title = "〢 Imperial Hub",
	Callback = function()
		loadstring(game:HttpGet(("https://raw.githubusercontent.com/Trev0rZ/LoaderM/main/ImperialHub-Working.lua"),true))()
	end,
})

Section:NewButton({
	Title = "〢 Rochips Panel",
	Callback = function()
		loadstring(game:HttpGet("https://rawscripts.net/raw/Universal-Script-rochips-universal-18294"))()
	end,
})

Section:NewButton({
	Title = "〢JuNXko Hub",
	Callback = function()
		-- Brookhaven RP
-- JUANKO BROOKHAVEN PANEL
-- JUANKO MODS YT 
 
 
loadstring(game:HttpGet("https://raw.githubusercontent.com/Juanko-Scripts/Roblox-scripts/main/Juanko%20Brookhaven%20Panel%20V1"))()
	end,
})

local Section = TabFrame:NewSection({
	Title = "〢〘Special \ مميز〙 ᵕ̈ ",
	Icon = "rbxassetid://7733749837",
	Position = "Right"
})

Section:NewButton({
	Title = "〢Brookhaven Admin",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/NotAtomz/brookhaven-admin/refs/heads/main/script"))()
	end,
})

local Section = TabFrame:NewSection({
	Title = "〢〘Special \ مميز〙 ᵕ̈ ",
	Icon = "rbxassetid://7733765398",
	Position = "Left"
})

Section:NewButton({
	Title = "〢Redz hub { Troll Version }",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/REDzHUB/REDzHUB/refs/heads/main/TrollVersion"))()
	end,
})

Section:NewButton({
	Title = "〢 راس الروبوت ",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/v1mk/PotatoesHub/refs/heads/main/z"))()
	end,
})

local TabFrame = Windows:NewTab({
	Title = "〢Ragdoll engine ⌞👨‍🏭⌝ ",
	Description = "≡;-°『Ragdoll function』",
	Icon = "rbxassetid://7733917120"
})

local Section = TabFrame:NewSection({
	Title = "〢〘 !  كل حلاوه〙",
	Icon = "rbxassetid://7743875962",
	Position = "Left"
})


Section:NewButton({
	Title = "〢 System hub",
	Callback = function()
		local credits = "SystemBroken made by system_calix"
loadstring(game:HttpGet("https://raw.githubusercontent.com/H20CalibreYT/SystemBroken/main/script"))()
	end,
})

Section:NewButton({
	Title = "〢Atomic En",
	Callback = function()
		loadstring(game:HttpGet("https://scriptblox.com/raw/Ragdoll-Engine-ATOMIC-HUB-8295"))()
	end,
})

Section:NewButton({
	Title = "〢Atomic Ar",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/n0kc/AtomicHub/main/Map-Al-Biout.lua"))()
	end,
})

Section:NewButton({
	Title = "〢zombie Engine",
	Callback = function()
		loadstring(game:HttpGet("https://scriptblox.com/raw/Ragdoll-Engine-Script-8721"))()
	end,
})


Section:NewButton({
	Title = "〢VictimMenu Hub",
	Callback = function()
		--VictimMenu DH
loadstring(game:HttpGet("https://raw.githubusercontent.com/GS21Official/DH-VictimMenu-Script/main/Dh%20VictimMenu%3A%20Script"))()
	end,
})

Section:NewButton({
	Title = "〢 BringAll",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/Bac0nHck/Scripts/main/BringFlingPlayers"))("More Scripts: t.me/arceusxscripts")
	end,
})

Section:NewButton({
	Title = "〢 Gojo Animation",
	Callback = function()
	
local animations = {
    idle = "rbxassetid://18537387180",    -- Primary idle animation
    idleAlt = "rbxassetid://18537376492", -- Alternate idle animation
    walk = "rbxassetid://18537392113",    -- Walk animation
    run = "rbxassetid://18537387180",     -- Run animation
    jump = "rbxassetid://18537367238",    -- Jump animation
    fall = "rbxassetid://18537367238",    -- Fall animation
    swim = "rbxassetid://18537367238",    -- Swim animation
    swimIdle = "rbxassetid://18537387180",-- Swim idle animation
    climb = "rbxassetid://18537367238"    -- Climb animation
}

-- Function to replace the default animations
local function replaceAnimations()
    local player = game.Players.LocalPlayer
    local character = player.Character or player.CharacterAdded:Wait()

    -- Wait for the Animate script to load
    local animateScript = character:WaitForChild("Animate")

    -- Replace each animation
    for animationType, animationId in pairs(animations) do
        if animateScript:FindFirstChild(animationType) then
            for _, anim in ipairs(animateScript[animationType]:GetChildren()) do
                if anim:IsA("Animation") then
                    anim.AnimationId = animationId
                end
            end
        end
    end

    -- Handle alternate idle animation separately
    local idle = animateScript:FindFirstChild("idle")
    if idle then
        local animAlt = idle:FindFirstChild("Animation2")
        if animAlt then
            animAlt.AnimationId = animations.idleAlt
        end
    end
end

-- Function to ensure animations loop
local function ensureAnimationsLoop()
    local player = game.Players.LocalPlayer
    local character = player.Character or player.CharacterAdded:Wait()

    -- Wait for the Humanoid to load
    local humanoid = character:WaitForChild("Humanoid")

    -- Connect to the AnimationPlayed event
    humanoid.AnimationPlayed:Connect(function(animationTrack)
        -- Ensure the animation loops
        animationTrack.Looped = true
    end)
end

-- Additional function to debug swimIdle animation
local function debugSwimIdle()
    local player = game.Players.LocalPlayer
    local character = player.Character or player.CharacterAdded:Wait()
    local animateScript = character:WaitForChild("Animate")
    local swimIdle = animateScript:FindFirstChild("swimIdle")
    
    if swimIdle then
        for _, anim in ipairs(swimIdle:GetChildren()) do
            if anim:IsA("Animation") then
                print("SwimIdle Animation ID:", anim.AnimationId)
                anim.AnimationId = animations.swimIdle
                print("Updated SwimIdle Animation ID:", anim.AnimationId)
            end
        end
    else
        print("swimIdle animation not found in Animate script.")
    end
end

-- Run the functions to replace animations, ensure they loop, and debug swimIdle
replaceAnimations()
ensureAnimationsLoop()
debugSwimIdle()
	end,
})

Section:NewButton({
	Title = "〢Potato Troll",
	Callback = function()
		loadstring(game:HttpGet("https://raw.githubusercontent.com/v1mk/PotatoesHub/76c1e822c37baee61a81d7e785f5159831fb3739/RagdollEngine.lua"))()
	end,
})

local Section = TabFrame:NewSection({
	Title = "〢〘 Shit function 〙 ᵕ̈ ",
	Icon = "rbxassetid://7733765398",
	Position = "Right"
})

Section:NewToggle({
	Title = "〢『 AntiFling 』ᵕ̈",
	Default = false,
	Callback = function(speaker,target)
		function attach(speaker,target)
	if tools(speaker) then
		local char = speaker.Character
		local tchar = target.Character
		local hum = speaker.Character:FindFirstChildOfClass("Humanoid")
		local hrp = getRoot(speaker.Character)
		local hrp2 = getRoot(target.Character)
		hum.Name = "1"
		local newHum = hum:Clone()
		newHum.Parent = char
		newHum.Name = "Humanoid"
		wait()
		hum:Destroy()
		workspace.CurrentCamera.CameraSubject = char
		newHum.DisplayDistanceType = "None"
		local tool = speaker:FindFirstChildOfClass("Backpack"):FindFirstChildOfClass("Tool") or speaker.Character:FindFirstChildOfClass("Tool")
		tool.Parent = char
		hrp.CFrame = hrp2.CFrame * CFrame.new(0, 0, 0) * CFrame.new(math.random(-100, 100)/200,math.random(-100, 100)/200,math.random(-100, 100)/200)
		local n = 0
		repeat
			wait(.1)
			n = n + 1
			hrp.CFrame = hrp2.CFrame
		until (tool.Parent ~= char or not hrp or not hrp2 or not hrp.Parent or not hrp2.Parent or n > 250) and n > 2
	else
		notify('Tool Required','You need to have an item in your inventory to use this command')
	end
end
	end,
})

Section:NewButton({
	Title = "〢 『Emotes Script』 ",
	Callback = function()
		loadstring(game:HttpGetAsync("https://gist.githubusercontent.com/RedZenXYZ/3da6af1961efa275de6c3c2a6dbace03/raw/bb027f99cec0ea48ef9c5eabfb9116ddff20633d/FE%2520Emotes%2520Gui"))()
	end,
})

Section:NewButton({
	Title = " 〢『 Push Aura 』 ",
	Callback = function()
		getgenv().pushaura = bool
        char = game.Players.LocalPlayer.Character

        for _, v in pairs(char:GetChildren()) do
            if v:IsA("BasePart") then
                v.Touched:Connect(function(hit)
                    if getgenv().pushaura == true then
                        local A_1 = game:GetService("Workspace"):FindFirstChild(hit.Parent.Name)
                        local Event = game:GetService("Players").LocalPlayer.Character.Push.PushTool
                        Event:FireServer(A_1)
                    end
                end)
            end
        end

	end,
})

Section:NewButton({
	Title = " 〢『 Anti Ragdoll 』 ",
	Callback = function()
        char.Humanoid.StateChanged:Connect(function(old, new)
            if old and new == Enum.HumanoidStateType.FallingDown then
                char.Humanoid:ChangeState(Enum.HumanoidStateType.Standing)
            end
        end)
        char.Humanoid.StateChanged:Connect(function(old, new)
            if new == Enum.HumanoidStateType.Physics then
                char.Humanoid:ChangeState(old)
            end
        end)

        char.Pushed:Destroy()
        char.RagdollMe:Destroy()
        DiscordLib:Notification("Notification", "If this doesn't work on reset, press this button again!", "Got it")
	end,
})


Section:NewButton({
	Title = "〢 『Tiktoks Emotes』 ",
	Callback = function()
		--keybind to open is comma
--made by Gi#7331

local IsStudio = false

local ContextActionService = game:GetService("ContextActionService")
local HttpService = game:GetService("HttpService")
local GuiService = game:GetService("GuiService")
local CoreGui = game:GetService("CoreGui")
local AvatarEditorService = game:GetService("AvatarEditorService")
local Players = game:GetService("Players")
local StarterGui = game:GetService("StarterGui")
local UserInputService = game:GetService("UserInputService")

local Emotes = {}
local function AddEmote(name: string, id: IntValue, price: IntValue?)
	if not (name and id) then
		return
	end

	table.insert(Emotes, {
		["name"] = name,
		["id"] = id,
		["icon"] = "rbxthumb://type=Asset&id=".. id .."&w=150&h=150",
		["price"] = price or 0,
		["index"] = #Emotes + 1,
		["sort"] = {}
	})
end
local CurrentSort = "newestfirst"

local FavoriteOff = "rbxassetid://10651060677"
local FavoriteOn = "rbxassetid://10651061109"
local FavoritedEmotes = {}

local ScreenGui = Instance.new("ScreenGui")
ScreenGui.Name = "Emotes"
ScreenGui.DisplayOrder = 2
ScreenGui.ZIndexBehavior = Enum.ZIndexBehavior.Sibling
ScreenGui.ResetOnSpawn = false
ScreenGui.Enabled = false

local BackFrame = Instance.new("Frame")
BackFrame.Size = UDim2.new(0.9, 0, 0.5, 0)
BackFrame.AnchorPoint = Vector2.new(0.5, 0.5)
BackFrame.Position = UDim2.new(0.5, 0, 0.5, 0)
BackFrame.SizeConstraint = Enum.SizeConstraint.RelativeYY
BackFrame.BackgroundTransparency = 1
BackFrame.BorderSizePixel = 0
BackFrame.Parent = ScreenGui

local EmoteName = Instance.new("TextLabel")
EmoteName.Name = "EmoteName"
EmoteName.TextScaled = true
EmoteName.AnchorPoint = Vector2.new(0.5, 0.5)
EmoteName.Position = UDim2.new(-0.1, 0, 0.5, 0)
EmoteName.Size = UDim2.new(0.2, 0, 0.2, 0)
EmoteName.SizeConstraint = Enum.SizeConstraint.RelativeYY
EmoteName.BackgroundColor3 = Color3.fromRGB(30, 30, 30)
EmoteName.TextColor3 = Color3.new(1, 1, 1)
EmoteName.BorderSizePixel = 0
EmoteName.Parent = BackFrame

local Corner = Instance.new("UICorner")
Corner.Parent = EmoteName

local Loading = Instance.new("TextLabel", BackFrame)
Loading.AnchorPoint = Vector2.new(0.5, 0.5)
Loading.Text = "Loading..."
Loading.TextColor3 = Color3.new(1, 1, 1)
Loading.BackgroundColor3 = Color3.new(0, 0, 0)
Loading.TextScaled = true
Loading.BackgroundTransparency = 0.5
Loading.Size = UDim2.fromScale(0.2, 0.1)
Loading.Position = UDim2.fromScale(0.5, 0.2)
Corner:Clone().Parent = Loading

local Frame = Instance.new("ScrollingFrame")
Frame.Size = UDim2.new(1, 0, 1, 0)
Frame.CanvasSize = UDim2.new(0, 0, 0, 0)
Frame.AutomaticCanvasSize = Enum.AutomaticSize.Y
Frame.ScrollingDirection = Enum.ScrollingDirection.Y
Frame.AnchorPoint = Vector2.new(0.5, 0.5)
Frame.Position = UDim2.new(0.5, 0, 0.5, 0)
Frame.BackgroundTransparency = 1
Frame.ScrollBarThickness = 5
Frame.BorderSizePixel = 0
Frame.MouseLeave:Connect(function()
	EmoteName.Text = "Select an Emote"
end)
Frame.Parent = BackFrame

local Grid = Instance.new("UIGridLayout")
Grid.CellSize = UDim2.new(0.105, 0, 0, 0)
Grid.CellPadding = UDim2.new(0.006, 0, 0.006, 0)
Grid.SortOrder = Enum.SortOrder.LayoutOrder
Grid.Parent = Frame

local SortFrame = Instance.new("Frame")
SortFrame.Visible = false
SortFrame.BorderSizePixel = 0
SortFrame.Position = UDim2.new(1, 5, -0.125, 0)
SortFrame.Size = UDim2.new(0.2, 0, 0, 0)
SortFrame.AutomaticSize = Enum.AutomaticSize.Y
SortFrame.BackgroundTransparency = 1
Corner:Clone().Parent = SortFrame
SortFrame.Parent = BackFrame

local SortList = Instance.new("UIListLayout")
SortList.Padding = UDim.new(0.02, 0)
SortList.HorizontalAlignment = Enum.HorizontalAlignment.Center
SortList.VerticalAlignment = Enum.VerticalAlignment.Top
SortList.SortOrder = Enum.SortOrder.LayoutOrder
SortList.Parent = SortFrame

local function SortEmotes()
	for i,Emote in pairs(Emotes) do
		local EmoteButton = Frame:FindFirstChild(Emote.id)
		if not EmoteButton then
			continue
		end
		local IsFavorited = table.find(FavoritedEmotes, Emote.id)
		EmoteButton.LayoutOrder = Emote.sort[CurrentSort] + ((IsFavorited and 0) or #Emotes)
		EmoteButton.number.Text = Emote.sort[CurrentSort]
	end
end

local function createsort(order, text, sort)
	local CreatedSort = Instance.new("TextButton")
	CreatedSort.SizeConstraint = Enum.SizeConstraint.RelativeXX
	CreatedSort.Size = UDim2.new(1, 0, 0.2, 0)
	CreatedSort.BackgroundColor3 = Color3.fromRGB(30, 30, 30)
	CreatedSort.LayoutOrder = order
	CreatedSort.TextColor3 = Color3.new(1, 1, 1)
	CreatedSort.Text = text
	CreatedSort.TextScaled = true
	CreatedSort.BorderSizePixel = 0
	Corner:Clone().Parent = CreatedSort
	CreatedSort.Parent = SortFrame
	CreatedSort.MouseButton1Click:Connect(function()
		SortFrame.Visible = false
		CurrentSort = sort
		SortEmotes()
	end)
	return CreatedSort
end

createsort(1, "Newest First", "newestfirst")
createsort(2, "Oldest First", "oldestfirst")
createsort(3, "Alphabetically First", "alphabeticfirst")
createsort(4, "Alphabetically Last", "alphabeticlast")
createsort(5, "Highest Price", "highestprice")
createsort(6, "Lowest Price", "lowestprice")

local SortButton = Instance.new("TextButton")
SortButton.BorderSizePixel = 0
SortButton.AnchorPoint = Vector2.new(0.5, 0.5)
SortButton.Position = UDim2.new(0.925, -5, -0.075, 0)
SortButton.Size = UDim2.new(0.15, 0, 0.1, 0)
SortButton.TextScaled = true
SortButton.TextColor3 = Color3.new(1, 1, 1)
SortButton.BackgroundColor3 = Color3.new(0, 0, 0)
SortButton.BackgroundTransparency = 0.3
SortButton.Text = "Sort"
SortButton.MouseButton1Click:Connect(function()
	SortFrame.Visible = not SortFrame.Visible
end)
Corner:Clone().Parent = SortButton
SortButton.Parent = BackFrame

local CloseButton = Instance.new("TextButton")
CloseButton.BorderSizePixel = 0
CloseButton.AnchorPoint = Vector2.new(0.5, 0.5)
CloseButton.Position = UDim2.new(0.075, 0, -0.075, 0)
CloseButton.Size = UDim2.new(0.15, 0, 0.1, 0)
CloseButton.TextScaled = true
CloseButton.TextColor3 = Color3.new(1, 1, 1)
CloseButton.BackgroundColor3 = Color3.new(0, 0, 0)
CloseButton.BackgroundTransparency = 0.3
CloseButton.Text = "Close"
CloseButton.MouseButton1Click:Connect(function()
	ScreenGui.Enabled = false
end)
Corner:Clone().Parent = CloseButton
CloseButton.Parent = BackFrame

local SearchBar = Instance.new("TextBox")
SearchBar.BorderSizePixel = 0
SearchBar.AnchorPoint = Vector2.new(0.5, 0.5)
SearchBar.Position = UDim2.new(0.5, 0, -0.075, 0)
SearchBar.Size = UDim2.new(0.55, 0, 0.1, 0)
SearchBar.TextScaled = true
SearchBar.PlaceholderText = "Search"
SearchBar.TextColor3 = Color3.new(1, 1, 1)
SearchBar.BackgroundColor3 = Color3.new(0, 0, 0)
SearchBar.BackgroundTransparency = 0.3
SearchBar:GetPropertyChangedSignal("Text"):Connect(function()
	local text = SearchBar.Text:lower()
	local buttons = Frame:GetChildren()
	if text ~= text:sub(1,50) then
		SearchBar.Text = SearchBar.Text:sub(1,50)
		text = SearchBar.Text:lower()
	end
	if text ~= ""  then
		for i,button in pairs(buttons) do
			if button:IsA("GuiButton") then
				local name = button:GetAttribute("name"):lower()
				if name:match(text) then
					button.Visible = true
				else
					button.Visible = false
				end
			end
		end
	else
		for i,button in pairs(buttons) do
			if button:IsA("GuiButton") then
				button.Visible = true
			end
		end
	end
end)
Corner:Clone().Parent = SearchBar
SearchBar.Parent = BackFrame

local function openemotes(name, state, input)
	if state == Enum.UserInputState.Begin then
		ScreenGui.Enabled = not ScreenGui.Enabled
	end
end

if IsStudio then
	ContextActionService:BindActionAtPriority(
		"Emote Menu",
		openemotes,
		true,
		2001,
		Enum.KeyCode.Comma
	)
else
	ContextActionService:BindCoreActionAtPriority(
		"Emote Menu",
		openemotes,
		true,
		2001,
		Enum.KeyCode.Comma
	)
end

local inputconnect
ScreenGui:GetPropertyChangedSignal("Enabled"):Connect(function()
	if ScreenGui.Enabled == true then
		EmoteName.Text = "Select an Emote"
		SearchBar.Text = ""
		SortFrame.Visible = false
		GuiService:SetEmotesMenuOpen(false)
		inputconnect = UserInputService.InputBegan:Connect(function(input, processed)
			if not processed then
				if input.UserInputType == Enum.UserInputType.MouseButton1 then
					ScreenGui.Enabled = false
				end
			end
		end)
	else
		inputconnect:Disconnect()
	end
end)

if not IsStudio then
	GuiService.EmotesMenuOpenChanged:Connect(function(isopen)
		if isopen then
			ScreenGui.Enabled = false
		end
	end)
end

GuiService.MenuOpened:Connect(function()
	ScreenGui.Enabled = false
end)

if not game:IsLoaded() then
	game.Loaded:Wait()
end

local LocalPlayer = Players.LocalPlayer

if IsStudio then
	ScreenGui.Parent = LocalPlayer.PlayerGui
else
	--thanks inf yield
	local SynV3 = syn and DrawingImmediate
	if (not is_sirhurt_closure) and (not SynV3) and (syn and syn.protect_gui) then
		syn.protect_gui(ScreenGui)
		ScreenGui.Parent = CoreGui
	elseif get_hidden_gui or gethui then
		local hiddenUI = get_hidden_gui or gethui
		ScreenGui.Parent = hiddenUI()
	else
		ScreenGui.Parent = CoreGui
	end
end


local function SendNotification(title, text)
	if (not IsStudio) and syn and syn.toast_notification then
		syn.toast_notification({
			Type = ToastType.Error,
			Title = title,
			Content = text
		})
	else
		StarterGui:SetCore("SendNotification", {
			Title = title,
			Text = text
		})
	end
end

local function HumanoidPlayEmote(humanoid, name, id)
	if IsStudio then
		return humanoid:PlayEmote(name)
	else
		return humanoid:PlayEmoteAndGetAnimTrackById(id)
	end
end

local function PlayEmote(name: string, id: IntValue)
	ScreenGui.Enabled = false
	SearchBar.Text = ""
	local Humanoid = LocalPlayer.Character:FindFirstChildOfClass("Humanoid")
	local Description = Humanoid and Humanoid:FindFirstChildOfClass("HumanoidDescription")
	if not Description then
		return
	end
	if LocalPlayer.Character.Humanoid.RigType ~= Enum.HumanoidRigType.R6 then
		local succ, err = pcall(function()
			HumanoidPlayEmote(Humanoid, name, id)
		end)
		if not succ then
			Description:AddEmote(name, id)
			HumanoidPlayEmote(Humanoid, name, id)
		end
	else
		SendNotification(
			"r6? lol",
			"you gotta be r15 dude"
		)
	end
end

local function WaitForChildOfClass(parent, class)
	local child = parent:FindFirstChildOfClass(class)
	while not child or child.ClassName ~= class do
		child = parent.ChildAdded:Wait()
	end
	return child
end

local params = CatalogSearchParams.new()
params.AssetTypes = {Enum.AvatarAssetType.EmoteAnimation}
params.SortType = Enum.CatalogSortType.RecentlyCreated
params.SortAggregation = Enum.CatalogSortAggregation.AllTime
params.IncludeOffSale = true
params.CreatorName = "Roblox"
params.Limit = 120

local function getCatalogPage()
	local success, catalogPage = pcall(function()
		return AvatarEditorService:SearchCatalog(params)
	end)
	if not success then
		task.wait(5)
		return getCatalogPage()
	end
	return catalogPage
end

local catalogPage = getCatalogPage()

local pages = {}

while true do
	local currentPage = catalogPage:GetCurrentPage()
	table.insert(pages, currentPage)
	if catalogPage.IsFinished then
		break
	end
	local function AdvanceToNextPage()
		local success = pcall(function()
			catalogPage:AdvanceToNextPageAsync()
		end)
		if not success then
			task.wait(5)
			return AdvanceToNextPage()
		end
	end
	AdvanceToNextPage()
end

local totalEmotes = {}
for _, page in pairs(pages) do
	for _, emote in pairs(page) do
		table.insert(totalEmotes, emote)
	end
end

for i, Emote in pairs(totalEmotes) do
	AddEmote(Emote.Name, Emote.Id, Emote.Price)
end

--unreleased emotes
AddEmote("Arm Wave", 5915773155)
AddEmote("Head Banging", 5915779725)
AddEmote("Face Calisthenics", 9830731012)

--finished loading
Loading:Destroy()

--sorting options setup
table.sort(Emotes, function(a, b)
	return a.index < b.index
end)
for i,v in pairs(Emotes) do
	v.sort.newestfirst = i
end

table.sort(Emotes, function(a, b)
	return a.index > b.index
end)
for i,v in pairs(Emotes) do
	v.sort.oldestfirst = i
end

table.sort(Emotes, function(a, b)
	return a.name:lower() < b.name:lower()
end)
for i,v in pairs(Emotes) do
	v.sort.alphabeticfirst = i
end

table.sort(Emotes, function(a, b)
	return a.name:lower() > b.name:lower()
end)
for i,v in pairs(Emotes) do
	v.sort.alphabeticlast = i
end

table.sort(Emotes, function(a, b)
	return a.price < b.price
end)
for i,v in pairs(Emotes) do
	v.sort.lowestprice = i
end

table.sort(Emotes, function(a, b)
	return a.price > b.price
end)
for i,v in pairs(Emotes) do
	v.sort.highestprice = i
end


local function IsFileFunc(...)
	if IsStudio then
		return
	elseif isfile then
		return isfile(...)
	end
end

local function WriteFileFunc(...)
	if IsStudio then
		return
	elseif writefile then
		return writefile(...)
	end
end

local function ReadFileFunc(...)
	if IsStudio then
		return
	elseif readfile then
		return readfile(...)
	end
end

if not IsStudio then
	if IsFileFunc("FavoritedEmotes.txt") then
		if not pcall(function()
			FavoritedEmotes = HttpService:JSONDecode(ReadFileFunc("FavoritedEmotes.txt"))
		end) then
			FavoritedEmotes = {}
		end
	else
		WriteFileFunc("FavoritedEmotes.txt", HttpService:JSONEncode(FavoritedEmotes))
	end
	local UpdatedFavorites = {}
	for i,name in pairs(FavoritedEmotes) do
		if typeof(name) == "string" then
			for i,emote in pairs(Emotes) do
				if emote.name == name then
					table.insert(UpdatedFavorites, emote.id)
					break
				end
			end
		end
	end
	if #UpdatedFavorites ~= 0 then
		FavoritedEmotes = UpdatedFavorites
		WriteFileFunc("FavoritedEmotes.txt", HttpService:JSONEncode(FavoritedEmotes))
	end
end


local function CharacterAdded(Character)
	for i,v in pairs(Frame:GetChildren()) do
		if not v:IsA("UIGridLayout") then
			v:Destroy()
		end
	end
	local Humanoid = WaitForChildOfClass(Character, "Humanoid")
	local Description = Humanoid:WaitForChild("HumanoidDescription", 5) or Instance.new("HumanoidDescription", Humanoid)
	local random = Instance.new("TextButton")
	local Ratio = Instance.new("UIAspectRatioConstraint")
	Ratio.AspectType = Enum.AspectType.ScaleWithParentSize
	Ratio.Parent = random
	random.LayoutOrder = 0
	random.TextColor3 = Color3.new(1, 1, 1)
	random.BorderSizePixel = 0
	random.BackgroundTransparency = 0.5
	random.BackgroundColor3 = Color3.new(0, 0, 0)
	random.TextScaled = true
	random.Text = "Random"
	random:SetAttribute("name", "")
	Corner:Clone().Parent = random
	random.MouseButton1Click:Connect(function()
		local randomemote = Emotes[math.random(1, #Emotes)]
		PlayEmote(randomemote.name, randomemote.id)
	end)
	random.MouseEnter:Connect(function()
		EmoteName.Text = "Random"
	end)
	random.Parent = Frame
	for i,Emote in pairs(Emotes) do
		Description:AddEmote(Emote.name, Emote.id)
		local EmoteButton = Instance.new("ImageButton")
		local IsFavorited = table.find(FavoritedEmotes, Emote.id)
		EmoteButton.LayoutOrder = Emote.sort[CurrentSort] + ((IsFavorited and 0) or #Emotes)
		EmoteButton.Name = Emote.id
		EmoteButton:SetAttribute("name", Emote.name)
		Corner:Clone().Parent = EmoteButton
		EmoteButton.Image = Emote.icon
		EmoteButton.BackgroundTransparency = 0.5
		EmoteButton.BackgroundColor3 = Color3.new(0, 0, 0)
		EmoteButton.BorderSizePixel = 0
		Ratio:Clone().Parent = EmoteButton
		local EmoteNumber = Instance.new("TextLabel")
		EmoteNumber.Name = "number"
		EmoteNumber.TextScaled = true
		EmoteNumber.BackgroundTransparency = 1
		EmoteNumber.TextColor3 = Color3.new(1, 1, 1)
		EmoteNumber.BorderSizePixel = 0
		EmoteNumber.AnchorPoint = Vector2.new(0.5, 0.5)
		EmoteNumber.Size = UDim2.new(0.2, 0, 0.2, 0)
		EmoteNumber.Position = UDim2.new(0.1, 0, 0.9, 0)
		EmoteNumber.Text = Emote.sort[CurrentSort]
		EmoteNumber.TextXAlignment = Enum.TextXAlignment.Center
		EmoteNumber.TextYAlignment = Enum.TextYAlignment.Center
		local UIStroke = Instance.new("UIStroke")
		UIStroke.Transparency = 0.5
		UIStroke.Parent = EmoteNumber
		EmoteNumber.Parent = EmoteButton
		EmoteButton.Parent = Frame
		EmoteButton.MouseButton1Click:Connect(function()
			PlayEmote(Emote.name, Emote.id)
		end)
		EmoteButton.MouseEnter:Connect(function()
			EmoteName.Text = Emote.name
		end)
		local Favorite = Instance.new("ImageButton")
		Favorite.Name = "favorite"
		if table.find(FavoritedEmotes, Emote.id) then
			Favorite.Image = FavoriteOn
		else
			Favorite.Image = FavoriteOff
		end
		Favorite.AnchorPoint = Vector2.new(0.5, 0.5)
		Favorite.Size = UDim2.new(0.2, 0, 0.2, 0)
		Favorite.Position = UDim2.new(0.9, 0, 0.9, 0)
		Favorite.BorderSizePixel = 0
		Favorite.BackgroundTransparency = 1
		Favorite.Parent = EmoteButton
		Favorite.MouseButton1Click:Connect(function()
			local index = table.find(FavoritedEmotes, Emote.id)
			if index then
				table.remove(FavoritedEmotes, index)
				Favorite.Image = FavoriteOff
				EmoteButton.LayoutOrder = Emote.sort[CurrentSort] + #Emotes
			else
				table.insert(FavoritedEmotes, Emote.id)
				Favorite.Image = FavoriteOn
				EmoteButton.LayoutOrder = Emote.sort[CurrentSort]
			end
			WriteFileFunc("FavoritedEmotes.txt", HttpService:JSONEncode(FavoritedEmotes))
		end)
	end
	for i=1,9 do
		local EmoteButton = Instance.new("Frame")
		EmoteButton.LayoutOrder = 2147483647
		EmoteButton.Name = "filler"
		EmoteButton.BackgroundTransparency = 1
		EmoteButton.BorderSizePixel = 0
		Ratio:Clone().Parent = EmoteButton
		EmoteButton.Visible = true
		EmoteButton.Parent = Frame
		EmoteButton.MouseEnter:Connect(function()
			EmoteName.Text = "Select an Emote"
		end)
	end
end

if LocalPlayer.Character then
	CharacterAdded(LocalPlayer.Character)
end
LocalPlayer.CharacterAdded:Connect(CharacterAdded)
	end,
})



end