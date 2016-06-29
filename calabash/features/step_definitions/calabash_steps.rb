require 'calabash-android/calabash_steps'

Given(/^I enter my secret password into input field number (\d+)$/) do |index|
  enter_text("android.widget.EditText index:#{index.to_i-1}", "123")
end